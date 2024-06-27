package FonctionsMethodes;

public class FonctionsMethodes {
    public static void main(String[] args) {
        System.out.println("\nFonctions et Méthodes\n");

        greeting();
        printSomme(14, 10);
        printSomme(14.8, 17.3);
        double air = calculAirCercle(5);
        System.out.println("L'air du cercle est de : " + air);
    }

    // Fonction simple
    static void greeting() {
        System.out.println("Hello World");
    }

    static void printSomme(int a, int b) {
        int result = a + b;
        System.out.println("La somme est : " + result);
    }

    // Overloading de fonction
    static void printSomme(double a, double b) {
        double result = a + b;
        System.out.println("La somme est : " + result);
    }

    static double calculAirCercle(int radius) {
        return Math.PI * radius * radius;

    }
}
