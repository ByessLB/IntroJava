package Variable;

import java.util.Scanner;

public class InteractionConsole {
    public static void main(String[] args) {
        // Ici nous allons demander de rentrer des données via la console
        // et les afficher sur la console

        // Pour cela nous allons utiliser la classe Scanner qui est dans le package java.util
        // Scanner est un objet qui permet de lire des données dans la console
        Scanner scanner = new Scanner(System.in);

        // Nous allons calculer l'air d'un cercle avec pour rayon l'entrée récupérée
        System.out.println("Calcul de l'air d'un cercle");
        System.out.println("Entrer le rayon :");

        // Nous installons les données récupérée dans une variable pour sa manipulation
        int radius = scanner.nextInt();
        
        // Nous instaurons le calcul de l'air par une méthode 'Math.PI' interne à java
        double air = Math.PI * radius * radius;

        System.out.println("L'air de cercle de rayon : " + radius + " est : \n" + air);
    }
}
