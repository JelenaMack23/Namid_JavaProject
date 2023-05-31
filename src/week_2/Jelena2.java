package week_2;

public class Jelena2 {


        public static void main(String[] args) {

            /*
Swap two variable values without using a third variable
 */

            int a = 10;
            int b = 20;

            a = a + b;  // a is ab
            b = a - b;  //  a is ab and - b we have only a left, so b = a
            a = a - b;  //  a is ab and - new b which is a now we have only b left, so a = b


            System.out.println("a is = " + a);
            System.out.println("b is = " + b);

            System.out.println("-------------------------------------------------------------------------");

            /* write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5 and 15
        if the number can be divisible by 3,5 and 15, then it should only be displayed in Divisible by 15 section
        if the number can be divisible by 3 cannot be divisible by 15, then it should only be displayed in Divisible by 3 section
        if the number can be divisible by 5 cannot be divisible by 15, then it should only be displayed in Divisible by 5 section

        output:
        Divisible by 15 15 30 45 60 75 90
        Divisible by 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
        Divisible by 3 5 10 20 25 35 40 50 55 65 70 80 85 95 100
         */

            System.out.print("Divisible by 15 ");
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {
                    System.out.print(i + " ");
                }

            }

            System.out.print( "\nDivisible by 3 ");
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0 && i % 15 != 0) {
                    System.out.print(i + " ");

                }
            }

            System.out.print("\nDivisible by 3 ");
            for (int i = 1; i <= 100; i++) {
                if (i % 5 == 0 && i % 15 != 0) {
                    System.out.print(i + " ");

                }
            }




        }


    }







