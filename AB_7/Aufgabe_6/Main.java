public class Main {
    public static void main(String[] args) {
        // Eingabe des Gewinns über die Konsole
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Gewinn in € ein:");
        float gewinn = scanner.nextFloat();

        // Berechnung ob der Vertreter eine Provision bekommt
        if (gewinn >= 10000.0) {
            System.out.println("Der Gewinn ist: " + gewinn + "€ Sie bekommen 10% Provision");
            float provision = gewinn * 0.1;
            System.out.println("Die Provision ist: " + provision + "€");
        } else {
            System.out.println("Der Gewinn ist: " + gewinn + "€ Sie bekommen keine Provision");
        }
    }
}
