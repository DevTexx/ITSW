package de.relaxogames.worksheet.Aufgabe_8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Hier wird das Objekt 'Scanner' implementiert
        Scanner tast = new Scanner(System.in);
        tast.nextInt();
        //Die Variablen 'hoehe', 'v_meter', 'v_kmh' und 'time' werden implementiert
        double hoehe, v_meter, v_kmh, time;

        //Die double 'g' wird implementiert (Diese steht für die Gravitation)
        double g = 9.81;

        //Der Benutzer wird dazu aufgefordert die Fallhöhe der Rakete anzugeben.
        System.out.println("Fallhöhe eingeben: ");

        //Der ausgelesene Wert wird als 'hoehe' initialisiert
        hoehe = tast.nextDouble();

        //Der Wert time berechnet sich aus der Wurzel aus 2*hoehe/g
        time = Math.sqrt(2*hoehe/g);

        //Der Wert 'time' wird dem Benutzer ausgegeben
        System.out.println(time);

        //Der Wert 'v_meter' wird berechnet aus der Zeit * Gravitation
        v_meter = time * g;

        //Der Wert 'v_kmh' wird aus 'v_meter' * 3.6 berechnet und initialisiert
        v_kmh = v_meter * 3.6;


        //Dem Benutzer bekommt nun alle Ergebnisse angezeigt.
        System.out.println("Endgeschwindigkeit = " + v_meter + " Metern pro Sekunde");
        System.out.println("Das entspricht: " + v_kmh + " Kilometern pro Stunde");
    }

}
