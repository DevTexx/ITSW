import java.lang.Math; 

public class Main {
    public static void main (String[] args) {
        
        // Schule besuchen?
        boolean schultag = true;
        if (schultag) {
            System.out.println("Ich gehe zur Schule");
        }

        // Schule besuchen oder Eis essen?
        schultag = false;
        if (schultag) {
            System.out.println("Ich gehe zur Schule");
        } else {
            System.out.println("ich gehe Eis essen");
        }

        // Führerschein machen oder abwarten
        float alter = 17.6;
        int alter_int = Math.round(alter);
        if (alter >= 18) {
            System.out.println("Führerschein machen");
        } else {
            System.out.println("Abwarten");
        }

        // Führerschein machen oder begelitetes Fahren?
        alter = 17.3;
        alter_int = Math.round(alter);
        if (alter >= 18) {
            System.out.println("Führerschein machen");
        } else if (alter == 17) {
            System.out.println("Begleitetes Fahren");
        } else {
            System.out.println("Abwarten");
        }
    }
}