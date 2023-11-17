package de.relaxogames.worksheet.Aufgabe_7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Hier wird das Objekt 'Scanner' implementiert
        Scanner tast = new Scanner(System.in);

        //Die double Einheiten 'celsius', 'fahrenheit' werden implementiert
        double celsius, fahrenheit;

        //Der Benutzer wird aufgefordert seinen Celsius Wert anzugeben.
        System.out.println("Bitte Grad Celsius eingeben: ");

        //Der über die Tastatur eingegebene Celsius Wert wird in der Double 'celsius' gespeichert
        celsius = tast.nextDouble();

        //Der Wert 'fahrenheit' wird durch die Berechnungsformel mithilfe des Wertes 'celsius' berechnet
        fahrenheit = celsius * 1.8 + 32;

        //Der umgerechnete Wert wird dem Benutzer schließlich als Nachricht ausgegeben
        System.out.println(celsius + " Grad Celsius sind " + fahrenheit + " Grad Fahrenheit");

        //END
    }
}
