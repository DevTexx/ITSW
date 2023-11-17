package de.relaxogames.worksheet.Aufgabe_5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Hier wird das Objekt 'Scanner' implementiert
        Scanner tastatur = new Scanner(System.in);

        //Ein String mit dem Variablennamen 'name' wird implementiert
        String name;

        //Zwei Integer mit dem Variablennamen 'alter' und 'tage' werden implementiert
        int alter, tage;

        //Der Benutzer wird dazu aufgefordert seinen Namen einzugeben.
        System.out.println("Bitte gebe deinen Namen:");

        //Die Variable 'name' wird mit dem Wert des Eingegebenen Strings initialisiert.
        name = tastatur.nextLine();

        //Der Benutzer wird dazu aufgefordet sein Alter anzugeben.
        System.out.println("und dein Alter ein");

        //Die Variable 'alter' wird mit dem eingegebenen Alter (Integer) initialisiert.
        alter = tastatur.nextInt();

        //Die Variable 'tage' wird berechnet, indem die angegebenen Jahre * 365 gerechnet werden.
        tage = alter * 365;

        //Der Benutzer erhält die Nachricht mit seinem Alter in Jahren und Tagen + seinen Namen
        System.out.println("Hallo " + name + " ,du bist " + alter + " Jahre oder " + tage + " Tage alt");
    }

}
