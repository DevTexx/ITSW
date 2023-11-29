public class Main {
    public static void main(String[] args) {
        // Kriege die länge der drei Seiten über die Konsole
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Länge der ersten Seite ein:");
        int a = scanner.nextInt();
        System.out.println("Bitte geben Sie die Länge der zweiten Seite ein:");
        int b = scanner.nextInt();
        System.out.println("Bitte geben Sie die Länge der dritten Seite ein:");
        int c = scanner.nextInt();

        // Berechne ob das Dreieck konstruierbar ist
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Das Dreieck ist konstruierbar");
        } else {
            System.out.println("Das Dreieck ist nicht konstruierbar");
        }
    }
}