package week_2;

import java.util.Scanner;

public class Suraye {

    public static void main(String[] args) {

        // Swap two variable' values without using a third variable

        int x = 20, y = 25;

        System.out.println("x = " + y);
        System.out.println("y = " + x);

        System.out.println("-------------------------------------");


        // Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.

        Scanner input = new Scanner(System.in);

        int n = 100;

        String divisibleBy15 = "";
        String divisibleBy5 = "";
        String divisibleBy3 = "";

        for (int i = 1; i < n; i++) {

            if (i % 15 == 0 && i % 3 == 0) {
                divisibleBy15 += i + " ";
            }
            if (i % 5 == 0 && i % 15 != 0) {
                divisibleBy5 += i + " ";
            }

            if (i % 3 == 0 && i % 15 != 0) {
                divisibleBy3 += i + " ";

            }


        }
        System.out.println("Divisible By 15: " + divisibleBy15);
        System.out.println("Divisible By 5: " + divisibleBy5);
        System.out.println("Divisible By 3: " + divisibleBy3);

        input.close();

        System.out.println("-------------------------------------");

        // Given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2,3, or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2, 3, or 5, it should be replaced by a concatenation of the respective words Codility, Test, and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all three numbers: 2, 3, and 5 should be replaced by CodilityTestCoders.


        int N =30;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println("CodilityTestCoders");
            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("CodilityTest");
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("CodilityCoders");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("TestCoders");
            } else if (i % 2 == 0) {
                System.out.println("Codility");
            } else if (i % 3 == 0) {
                System.out.println("Test");
            } else if (i % 5 == 0) {
                System.out.println("Coders");
            } else {
                System.out.println(i);
            }
        }

    }


}
