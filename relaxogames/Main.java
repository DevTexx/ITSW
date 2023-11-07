package de.relaxogames;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner tastatur = new Scanner(System.in);

        System.out.print("Bitte gib deinen Verbrauch an: ");
        double verbraucht = tastatur.nextDouble();

        System.out.print("Bitte gib nun deine zurückgelegte Strecke an: ");
        double strecke = tastatur.nextDouble();

        double calc = (verbraucht / strecke) * 100;

        System.out.println(" ");
        System.out.println("Deine Durchschnittsverbrauch lieg bei: " + calc);

    }
}
