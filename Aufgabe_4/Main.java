package de.relaxogames.worksheet.Aufgabe_4;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //Hier wird ein String mit dem Variablennamen: 'name' implementiert.
        String name;

        //Hier wird das Objekt 'Scanner' implementiert
        Scanner tastatur = new Scanner(System.in);

        //Dem Benutzer wird eine Nachricht gesendet, die ihn dazu auffordert seinen Namen einzugeben.
        System.out.println("Bitte Geben Sie ihren Namen und Vornamem: ");

        //Hier wird die Variable 'name', die in Zeile 11 implementiert wurde, mit dem eingegebenen Tastatur Wert initialisiert.
        name = tastatur.nextLine();

        //Zum Schluss wird das Ergebnis ausgegeben.
        System.out.print("Guten Morgen Herr (bzw. Frau) " + name);

        //END
    }

}
