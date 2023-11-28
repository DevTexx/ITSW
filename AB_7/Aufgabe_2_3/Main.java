import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Eingabe der Temperatur in Grad Celsius über die Konsole
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bitte geben Sie die Temperatur in Grad Celsius ein:");
        int temperatur = scanner.nextInt();

        if (temperatur > 25) {
            System.out.println("Es ist warm");
        } else if (temperatur > 15) {
            System.out.println("Es ist angenehm");
        } else if (temperatur > 5) {
            System.out.println("Es ist kalt");
        } else {
            System.out.println("Es ist sehr kalt");
        }
    }
}
