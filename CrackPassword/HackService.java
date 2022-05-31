
import java.util.Scanner;

public class HackService {
    HackService() {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HackFactory hackFactory = new HackFactory();
        String pwd;
        System.out.print("\n\nveuillez entrer votre mot de passe : ");
        pwd = sc.nextLine();
        System.out.println("1\t Brute Force Attack");
        System.out.println("2\t Dictionary Attack");

        System.out.println("Please enter your choice:");

        int choice = sc.nextInt();
        Hack hack = null;
        switch (choice) {
            case 1:
                hack = hackFactory.createAlgorithm(1);
                hack.cracker(pwd);
                break;
            case 2:
                hack = hackFactory.createAlgorithm(2);
                hack.cracker(pwd);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
