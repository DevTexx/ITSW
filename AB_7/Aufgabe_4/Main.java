public class Main {
    public static void main(String[] args) {
        // Eingabe der Kosten über die Konsole in einer float
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die den Gesamtpreis in € ein:");
        float kosten = scanner.nextFloat();

        if (kosten >= 200.0) {
            System.out.println("Der Preis ist: " + kosten + "€ Sie sind Portofrei");
        } else {
            kosten += 5.50;
            System.out.println("Der neue Preis ist: " + kosten + "€ Sie müssen 5.50€ Portokosten zahlen");
        }
    }
}