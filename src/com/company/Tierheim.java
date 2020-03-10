package com.company;

public class Tierheim {
    public static void main(String[] args) {
        System.out.println("Willkommen im glücklichen Tierheim!");

        // Hund Lessie - 20 kg - spielfreudig , löst Kriminalfälle
        double futterLessie;
        double ge = 20;

        futterLessie = berechneFuttermenge (ge);
        System.out.println("Lessie bekommt " + futterLessie + "kg Futter");

        ++ge;
        // ge = ge + 1;
        // ge += 1;
        // ge++;

        // füttern am Abend
        futterLessie = berechneFuttermenge (ge);
        System.out.println("Lessie bekommt am Abend " + futterLessie + "kg Futter");

    }

    public static double berechneFuttermenge (double gewicht) {

        double futterMenge;

        futterMenge = gewicht / 20;

        return futterMenge;
        // ganz kurz geschrieben
        // return gewicht / 20;
        }

    }

