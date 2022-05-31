import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DictionnaryAttack {

    public void cracker(String passwordInput) {
        try {
            FileInputStream file = new FileInputStream("my-file.txt");
            Scanner line = new Scanner(file);
            Boolean bool = false;
            int timing = 0;
            while (line.hasNextLine()) {
                String password = line.nextLine();
                timing++;
                if (passwordInput.equals(password)) {
                    bool = true;
                    System.out.println("mot de passe trouvé : " + passwordInput + "\nnombre de tentatives :" + timing);
                }
            }
            if (!bool) {
                System.out.println("Password not found");
            }
            line.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
