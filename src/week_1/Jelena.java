package week_1;

import java.text.DecimalFormat;

public class Jelena {

    public static void main(String[] args) {

        int num1 = 34;
        int num2 = 35;

        System.out.println(checkEvenOrOdd(num1));
        System.out.println(checkEvenOrOdd(num2));

        System.out.println("--------------------------------");

        System.out.println(DivideWithoutOperator(24, 7));
        System.out.println(DivideWithoutOperator(24.5, 7.5));
        System.out.println(DivideWithoutOperator(-24, 7));
        System.out.println(DivideWithoutOperator(-24, -7));

        System.out.println("--------------------------------");


        printFINRA();

    }

    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
/*
    public static String DivideWithoutOperator (int num1, int num2){
        int result = 0;

        while (num1-num2 >= 0){ // subtract num2 from num1
            result++; // increments
            num1-=num2; // stops subtracting than num1 is less than num2
        }
        return result + " remainder " + num1;
    }

 */

    public static String DivideWithoutOperator(double num1, double num2) {
        double result = 0;

        // Determine the sign of the quotient
        boolean isNegative = (num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0);

        // Convert both numbers to their absolute values to ensure division performed with positive numbers
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        while (num1 - num2 >= 0) { // while loop checks the difference between num1 and num2 is more than or equal to 0.
            num1 -= num2; // subtract num2 from num1
            result++; // increment variable by 1 in each iteration
        }

        // Adjust the sign of the quotient
        if (isNegative) {
            result =- result; // if it is negative, variable is negated by multiplying it by -1
        }

        return result + " remainder " + num1;
    }


    public static void printFINRA() {
        for (int i = 1; i <= 30; i++) { // iterate between 1 and 30
            if (i % 3 == 0 && i % 5 == 0) { // checks if number is divisible by 3 and 5
                System.out.println("FINRA");
            } else if (i % 3 == 0) { // checks if number is divisible by 3
                System.out.println("FIN");
            } else if (i % 5 == 0) { // checks if number is divisible by 5
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }
    }




}





