package week2;

import java.util.Scanner;

public class Zehra2 {
    public static void main(String[] args) {


      /*
   Task1: Swap two numbers variable' values without using a third variable
     */

        int a = 10;
        int b = 20;
        System.out.println("Before swapping:");
        System.out.println("x = " + a);
        System.out.println("b = " + b);


        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        /*
        Short way:
        a = 10;
        b = 20;
        After swapping:
        a = 20
        b = 10
         */


        System.out.println("...................");


/*
    Task2: write a program that can print the numbers between 1~100 that can be divisible by 3,5 and 15.
     if the number can be divisible by 3,5 and 15 then it should be displayed in DivisibleBy15 section
      if the number can be divisible by 3 but cannot be divisible by 15, then it should ONLY be
     displayed in DivisibleBy3 section
     if the number can be divisible by 5 but cannot be divisible by 15, then it should ONLY be
      displayed in DivisibleBy5 section
    ex:
      Divisible By 15 15 30 45 60 75 90
      Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
      Divisible By 3 .....
    */

        Scanner input = new Scanner(System.in);
        int n = 100;

        String divisibleBy15 = "";
        String divisibleBy5 = "";
        String divisibleBy3 = "";

        for (int i = 1; i <= n; i++) {

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
        System.out.println("DivisibleBy 15:" + divisibleBy15);
        System.out.println("Divisible By 5:" + divisibleBy5);
        System.out.println("Divisible By 3: " + divisibleBy3);
        input.close();

        System.out.println("--------------------");

        /*
       Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on sperate line.However, any number divisible by 2,3 or 5 should be replaced by the world Codility,Test or Coders respectively.If numbers is divisible by more than one of the numbers:2,3 or5, it should be replaced by a concatenation of the respective words Codility. Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replacee by CodlityTest and numbers divisible by all three numbers:2,3 and, should be replaced by CodilityTestCoders.


         */
        int N = 35;
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
