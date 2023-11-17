package de.relaxogames.worksheet.Aufgabe_3;

import java.util.Scanner;

public class Main_3b {

    public static void main(String[] args) {
        //Hier wird der Scanner Initialisiert
        Scanner tastatur = new Scanner(System.in);

        //Hier werden die double einheit (fließkommazahl) 'zahl1','zahl2','erg' implementiert
        double zahl1, zahl2, erg;

        //Aufforderung des Programms an den Benutzer die erste Kommazahl einzugeben
        System.out.println("Ihre 1. Kommazahl: ");

        //Hier wird die Double 'zahl1' initialisiert mit dem eingegebenen Wert
        zahl1 = tastatur.nextDouble();

        //Aufforderung des Programms an den Benutzer die zweite Kommazahl einzugeben
        System.out.println("Ihre 2. Kommazahl: ");

        //Hier wird die Double 'zahl2' initialisiert mit dem eingegebenen Wert
        zahl2 = tastatur.nextDouble();

        //Hier findet die Berechnung des Ergebnisses statt
        erg = zahl1 / zahl2;

        //Zum Schluss wird das Ergebnis ausgegeben.
        System.out.println("Ihr Ergebnis ist: " + erg);


        //END
    }

}
