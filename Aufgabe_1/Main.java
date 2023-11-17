package de.relaxogames.worksheet.Aufgabe_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Hier wird der Scanner Initialisiert
        Scanner tastatur = new Scanner(System.in);

        //Eine Nachricht wird ausgegeben, die auffordert seinen Namen einzugeben
        System.out.println("Ihr Name: ");

        //Der String mit dem Variablennamen: 'name' wird initialisiert. Dieser wird zur Tastatur ausgabe gleichgesetzt
        String name = tastatur.next();

        //Eine Nachricht wird ausgegeben, die auffordert sein Alter anzugeben
        System.out.println("Ihr Alter: ");

        //Der Integer 'alter' speicher die über die Tastatur eingegebene Zahl
        int alter = tastatur.nextInt();

        //Eine Nachricht wird ausgegeben, die alle Informationen miteinander kombiniert
        System.out.println("Sie sind " + alter + " Jahre alt und heißen " + name + "!");
    }
}
