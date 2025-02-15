package cetpa;

import java.util.Scanner;

public class LCMHCFEXM {

    // Function to calculate HCF
    public static int calculateHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM
    public static int calculateLCM(int a, int b, int hcf) {
        return Math.abs(a * b) / hcf;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate HCF
        int hcf = calculateHCF(num1, num2);

        // Calculate LCM
        int lcm = calculateLCM(num1, num2, hcf);


        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);

        scanner.close();
    }
}
