package TP;

public class Factoriel {
    public static void main(String[] args) {
        System.out.println("Algorithme factoriel");
        // System.out.println("Le factoriel de 2 est : " + factorial(2));
        System.out.println("Le factoriel de 5 est : " + factorial(5));

    }

    // Fonction
    // Le Factoriel d'un nombre n est : n * (n-1) * (n-2) * ... * 1

    /*
    static int factorial(int n) {
        if (n == 1) return n;
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    */

    static int factorial(int n) {
        if (n == 1) return n;
        return n * factorial(n - 1);
    }
}
