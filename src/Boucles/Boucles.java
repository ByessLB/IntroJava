package Boucles;

import java.util.Scanner;

public class Boucles {
    public static void main(String[] args) {
        System.out.println("\nLes Boucles \n");

        // Boulce "FOR"

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("\n");

        // Boucle "WHILE"

        int i = 10;
        while (i>=0) {
            System.out.println(i);
            i--;
        }

        System.out.println("\n");

        // Boucle "DO-WHILE"

        Scanner scanner = new Scanner(System.in);
        int value = 0;

        do{
            System.out.println("Entrez un nombre :");
            value = scanner.nextInt();
        } while (value !=0);
    }
}
