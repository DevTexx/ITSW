public class Main {
    public static void main(String[] args) {
        // Eingabe ob man mit dem Monatsnahmen oder der Monatszahl arbeiten will^
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wollen Sie mit dem Monatsnahmen oder der Monatszahl arbeiten?");
        System.out.println("Bitte geben Sie 'Monatsnahmen' oder 'Monatszahl' ein:");
        String eingabe = scanner.nextLine();

        if (eingabe.equals("Monatsnahmen")) {
            // Eingabe des Monats über die Konsole
            System.out.println("Bitte geben Sie den Monatsnahmen ein:");
            String monat = scanner.nextLine();

            // Berechnung der Jahreszeit
            if (monat.equals("Dezember") || monat.equals("Januar") || monat.equals("Februar")) {
                System.out.println("Es ist Winter");
            } else if (monat.equals("März") || monat.equals("April") || monat.equals("Mai")) {
                System.out.println("Es ist Frühling");
            } else if (monat.equals("Juni") || monat.equals("Juli") || monat.equals("August")) {
                System.out.println("Es ist Sommer");
            } else if (monat.equals("September") || monat.equals("Oktober") || monat.equals("November")) {
                System.out.println("Es ist Herbst");
            } else {
                System.out.println("Der Monat ist ungültig");
            }
            return;
        } else if (!eingabe.equals("Monatszahl")) {
            System.out.println("Die Eingabe ist ungültig");
            return;
        }

        // Eingabe des Monats über die Konsole
        System.out.println("Bitte geben Sie den Monat ein:");
        int monat = scanner.nextInt();

        // Berechnung der Jahreszeit
        if (monat == 12 || monat == 1 || monat == 2) {
            System.out.println("Es ist Winter");
        } else if (monat == 3 || monat == 4 || monat == 5) {
            System.out.println("Es ist Frühling");
        } else if (monat == 6 || monat == 7 || monat == 8) {
            System.out.println("Es ist Sommer");
        } else if (monat == 9 || monat == 10 || monat == 11) {
            System.out.println("Es ist Herbst");
        } else {
            System.out.println("Der Monat ist ungültig");
        }
    }
}
