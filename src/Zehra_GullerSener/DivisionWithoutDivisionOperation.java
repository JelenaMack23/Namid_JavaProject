package Zehra_GullerSener;

public class DivisionWithoutDivisionOperation {

    public static int divide(int dividend, int divisor) {
        // Handle division by zero
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }

        // Determine the sign of the quotient
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int quotient = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        if (isNegative) {
            quotient = -quotient;
        }

        return quotient;
    }

    public static void main(String[] args) {
        int dividend = 15;
        int divisor = 3;
        int result = divide(dividend, divisor);
        System.out.println("Quotient: " + result); // Output: Quotient: 5

    }
}

/*
In this example, the divide method takes two parameters, dividend and divisor, and returns the quotient of the division. It follows the same approach as the Python implementation, using repeated subtraction to find the quotient. The main method demonstrates how to use the divide method by dividing 15 by 3 and printing the quotient.
 */
/*
Write a method can divide numbers without using division operator
 */