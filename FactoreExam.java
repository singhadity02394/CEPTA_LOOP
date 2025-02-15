package cetpa;

import java.util.Scanner;

public class FactoreExam {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Display the factors
        System.out.println("Factors of " + number + " are:");


        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                System.out.println(i);
            }
        }


        scanner.close();
    }
}

