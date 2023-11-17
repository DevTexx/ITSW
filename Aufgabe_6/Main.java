package de.relaxogames.worksheet.Aufgabe_6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Hier wird das Objekt 'Scanner' implementiert
        Scanner tast = new Scanner(System.in);

        //Der Integer 'sekunden' wird implementiert
        int sekunden;

        //Die Integer 'min','std','tage','jahre' werden in den Code implementiert
        int min, std, tage, jahre;

        //Der Integer 'temp', der dazu genutzt werden soll den REST einer rechnung kurzfristig zu speicher wird hier implementiert
        int temp;

        //Aufforderung an den Benutzer die Sekunden anzugeben, um die Umrechnung zu starten.
        System.out.println("Bitte Sekunden eingeben");

        //Initialisierung der variablen 'sekunden' mit dem eingegebenen Sekunden Wert
        sekunden = tast.nextInt();

        //Der Integer 'jahre' wird mittles einer Rechnung initialisiert
        jahre = sekunden / 31536000;

        //Der Integer 'temp' wird überschrieben mit dem Wert des Restes aus der Rechnung.
        temp = sekunden % 31536000;

        //Der Integer 'tage', wird mittles einer Rechnung initialisiert. Der Rest der vorherigen Rechnung bietet die Grundlage hierfür
        tage = temp / 86400;

        //Der Integer 'temp' wird überschrieben mit dem Wert des Restes aus der Rechnung.
        temp = temp % 86400;

        //Der Integer 'std', wird mittles einer Rechnung initialisiert. Der Rest der vorherigen Rechnung bietet die Grundlage hierfür
        std = temp / 3600;

        //Der Integer 'temp' wird überschrieben mit dem Wert des Restes aus der Rechnung.
        temp = temp % 3600;

        //Der Integer 'min', wird mittles einer Rechnung initialisiert. Der Rest der vorherigen Rechnung bietet die Grundlage hierfür
        min = temp / 60;

        //Der Integer 'temp' wird überschrieben mit dem Wert des Restes aus der Rechnung.
        temp = temp % 60;

        //Die restlichen Sekunden bleiben übrig und werden in der Variablen 'sekunden' gespeichert.
        sekunden = temp;

        //Zum Schluss werden alle Informationen und Rechnungen ausgegeben.
        System.out.println(jahre + " Jahre");
        System.out.println(tage + " Tage");
        System.out.println(std + " Stunden");
        System.out.println(min + " Minuten");
        System.out.println(sekunden + " Sekunden");

        //END
    }
}
