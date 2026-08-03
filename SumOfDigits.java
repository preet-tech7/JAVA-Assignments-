package info.java;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 1000: ");
        int number = sc.nextInt();

        if (number < 0 || number > 1000) {
            System.out.println("Invalid input! Please enter a number between 0 and 1000.");
        } else {

            int sum = 0;

            while (number > 0) {
                sum = sum + (number % 10);
                number = number / 10;
            }

            System.out.println("Sum of digits = " + sum);
        }

        sc.close();
    }
}