package Variable;

public class Interaction {
    public static void main(String[] args) {
        // Interaction entre variable, ici avec des entiers

        int a = 10;
        int b = 5;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Les comparaisons avec les variables
        int c = 10;
        int d = 3;

        System.out.println(c <= d);
        System.out.println(c >= d);
        System.out.println(c != d);

        // Interaction entre variable, ici avec des booléen
        boolean javaIsFun = true;
        boolean javaIsHard = false;

        System.out.println(javaIsFun || javaIsHard);
    }
}
