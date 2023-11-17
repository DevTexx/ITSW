package de.relaxogames.worksheet.Aufgabe_3;

import java.util.Scanner;

public class Main_3a {

    public static void main(String[] args) {

        //Hier wird der Scanner Initialisiert
        Scanner tastatur = new Scanner(System.in);

        //Hier werden die Integer 'zahl1','zahl2','erg' implementiert
        int zahl1, zahl2, erg;

        //Aufforderung des Programms an den Benutzer die erste Zahl einzugeben
        System.out.println("Ihre 1. Zahl: ");

        //Hier wird der Integer 'zahl1' initialisiert mit dem eingegebenen Wert
        zahl1 = tastatur.nextInt();

        //Aufforderung des Programms an den Benutzer die zweite Zahl einzugeben
        System.out.println("Ihre 2. Zahl: ");

        //Hier wird der Integer 'zahl2' initialisiert mit dem eingegebenen Wert
        zahl2 = tastatur.nextInt();

        //Hier findet die Berechnung des Ergebnisses statt
        erg = zahl1 - zahl2;

        //Zum Schluss wird das Ergebnis ausgegeben.
        System.out.println("Ihr Ergebnis ist: " + erg);

        //END
    }
}
