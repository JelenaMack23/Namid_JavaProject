package week_1;

public class Jelena {

    public static void main(String[] args) {


        // have a nice day
        // see you tomorrow
        // new change day 3
        //////

        Odd_Even_Numbers(5);
        Odd_Even_Numbers(8);

        System.out.println(DivideWithoutOperator(32, 6));

        printFINRA(); // will print numbers that are not divisible by 3 and 5, or print "FIN", "RA", or "FINRA" if numbers are divisible by 3 and 5.


    }

    /*
   Write a method which can identify if even number is odd or even
    */
    public static void Odd_Even_Numbers(int number) {
        if (number % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }



        /*
        Write a method that can divide two numbers without using division operator
         */

    }

    public static String DivideWithoutOperator(int num1, int num2) {
        int result = 0;

        while (num1 - num2 >= 0) { // subtract num2 from num1
            result++; // increments
            num1 -= num2; // stops subtracting than num1 is less than num2
        }
        return result + " remainder " + num1;
    }


                      /*FINRA :
         Write a method which prints out the numbers from 1 to 30 but for numbers which
         are a multiple of 3print "FIN" instead of the number and for numbers which are a
         multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
         both 3 and 5, print "FINRA" instead of the number.*/

    public static void printFINRA() {
        for (int i = 1; i <= 30; i++) { // iterate between 1 and 30
            if (i % 3 == 0 && i % 5 == 0) { // checks if number is divisible by 3 and 5
                System.out.println( i + " FINRA");
            } else if (i % 3 == 0) { // checks if number is divisible by 3
                System.out.println( i + " FIN");
            } else if (i % 5 == 0) { // checks if number is divisible by 5
                System.out.println( i + " RA");
            } else {
                System.out.println(i+" ");
            }

        }

    }





}



