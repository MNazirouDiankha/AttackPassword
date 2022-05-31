
public class HackFactory {
    HackFactory() {
    }

    public Hack hack = null;

    Hack createAlgorithm(int choice) {
        switch (choice) {
            case 1:
                hack = new BruteForce();
                break;
            case 2:
                hack = new DictionaryAttack();
                break;
        }
        return hack;
    }
}
