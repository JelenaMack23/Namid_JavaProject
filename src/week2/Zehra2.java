package week2;

public class Zehra2 {
    public static void main(String[] args) {


      /*
    Swap two numbers variable' values without using a third variable
     */

        int a = 10;
        int b = 20;
        System.out.println("Before swapping:");
        System.out.println("x = " + a);
        System.out.println("b = " +b);


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




    }




}
