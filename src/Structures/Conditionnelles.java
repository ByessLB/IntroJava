package Structures;

public class Conditionnelles {
    public static void main(String[] args) {
        System.out.println("Cotnrole du flow");


        // Fonction if
        int age = 24;

        if (age >65) {
            System.out.println("Senior");
        } else if (age >= 18) {
            System.out.println("Majeur");
        } else {
            System.out.println("Mineur");
        }


        // Fonction switch
        int day = 4;

        switch(day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Semaine");
                break;
            case 6:
            case 7:
                System.out.println("WeekEnd");
                break;
            default:
                System.out.println("Pas un jour de la semaine");
        }
    }
}
