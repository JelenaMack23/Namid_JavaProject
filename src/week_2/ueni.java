package week_2;

public class ueni {

    public static void main(String[] args) {

        /*Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
OutPut:
Divisible By 15 15 30 45 60 75 90
Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99

         */

        //Divisible by 3,5,15

        String by15 = "";
        String by5 = "";
        String by3 = "";


        for (int i = 1; i <=100; i++) {

            if(i % 3 == 0 && i % 5 == 0 && i % 15 == 0 ){
               by15 += i+" ";

            }
             if(i % 5 == 0 && i % 15 != 0  ) {
                 by5 += i + " ";
             }

            if(i % 3 == 0 && i % 15 != 0 ){

                by3 += i + " ";

            }

        }

        System.out.println("Divisivle by 15 " +by15);
        System.out.println("Divisivle by 5 " +by5);
        System.out.println("Divisivle by 3 " +by3);


        System.out.println("-----------------------------------------------");




     swapTask(5,3);

     System.out.println("-----------------------------------------");

     consecutiveTask(24);


    }

    public static void swapTask(int x, int y){


        x=y+x;
        y=x-y;
        x=x-y;
        System.out.println("x="+x);
        System.out.println("y="+y);


    }



    public static void consecutiveTask(int n) {

        /*Numbers -- print consecutive numbers
Write a function:
that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replace by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.


         */


        for (int i = 1; i <= n; i++) {



            if(i%2==0 && i%3==0&&i%5==0){
                System.out.println("CodilityTestCoders");

            } else if (i%2==0 && i%3==0) {
                System.out.println("CodilityTest");


            }else if(i%2==0&&i%5==0){
                System.out.println("CodilityCoders");

            }else if(i%3==0 & i%5==0){
                System.out.println("TestCoders");

            }else if(i%2==0){
                System.out.println("Codility");
            }else if(i%3==0){
                System.out.println("Test");

            } else if (i%5==0) {
                System.out.println("Coders");
            }else {
                System.out.println(i);
            }


        }

    }



}
