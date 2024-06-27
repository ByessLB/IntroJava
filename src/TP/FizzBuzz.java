package TP;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("\nCréation d'un FizzBuzz\n");

        for (int i = 1; i<= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " is a FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " is a Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " is a Buzz");
            }
        }
    }
}
