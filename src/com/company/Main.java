package com.company;

import com.sun.deploy.security.SelectableSecurityManager;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int alter = 14;

        if (alter >= 18) {
            // hier immer rein wenn mindestens 18 Jahre alt
            System.out.println("Auch Schnaps ist erlaubt");
        } else if (alter >= 16) {
            System.out.println("Yaaayy ich darf hinein, aber nur mit Wein!");
        } else {
            // hier gehen wir rein wenn wir nicht 18 sind
            System.out.println("Gehe zwischenzeitlich Pizza essen");
        }
        // hier wird der Code immer ausgeführt
        System.out.println("Warte gelangweilt im Auto");

        // Beispiel für einen Switch
        int note = 2, stipendium;

        // Berechne Förderstipedium
        switch (note) {
            case 1:
                // hier steht der code der ausgeführt wird wenn ich 1 bekomme
                stipendium = 100;
                break;
            case 2:
                stipendium = 50;
                break;
            case 3:
                stipendium = 30;
                break;
            default:
                stipendium = 10;
                break;
        }
        System.out.println("Stipendium: " + stipendium + "€");


    }
}
