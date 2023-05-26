package Piroska_Pap;

public class DivisionWithoutOperator {
    public static int divide(int dividend, int divisor) {
        // Handle division by zero

        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");

        }
        if (dividend == 0) {
            return 0;// 0 divided by anything is 0

        }
        //Handle special cases
        if (divisor == 1) {//
            return dividend;//Anything divided by 1 is
        }
        boolean negativeResult = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0);
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        int quotient = 0;
        while (absDividend >= absDivisor) {
            absDividend -= absDividend;
            quotient++;
        }
        if (negativeResult) {
            quotient = -quotient;
        }
        return quotient;
    }

    public static void main(String[] args) {
        int dividend = 15;
        int divisor = 3;
        int result = divide(dividend, divisor);
        System.out.println(dividend + "/ " + dividend + " = " + result);


    }
}
