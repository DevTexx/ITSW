package de.relaxogames.worksheet.Aufgabe_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Hier wird der Scanner Initialisiert
        Scanner tastatur = new Scanner(System.in);

        //Hier werden die Integer 'dividend','divisor','erg','rest' implementiert
        int dividend, divisor, erg, rest;

        //Nachrichten aufforderung zum Eingeben des Dividenden
        System.out.println("Dividend: ");

        //Speicherung des eingegebenen Wertes in diesem Integer (initialisierung)
        dividend = tastatur.nextInt();

        //Nachrichten aufforderung zum Eingeben des Divisors
        System.out.println("Divisor: ");

        //Speicherung des eingegebenen Wertes in diesem Integer (initialisierung)
        divisor = tastatur.nextInt();

        //Hier wird der REST berechenet. Dies wird mit dem '%'-Zeichen ausgeführt
        rest = dividend % divisor;

        //Hier wird die GANZZAHL berechnet, diese Zahl beinhaltet NICHT den Rest
        erg = dividend / divisor;

        //Hier wird nun das Fertige ergebnis ausgegeben
        System.out.println("Ganzzahlige Division mit Rest");
        System.out.println("Dividend: " + dividend);
        System.out.println("Divisor: " + divisor);
        System.out.println("Das Ergebnis der Division: "+ dividend + ":" + divisor + " ist " + erg + " Rest " + rest);
        System.out.println("Programmende Ganzteil.");

    }

}
