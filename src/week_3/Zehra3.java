package week_3;

public class Zehra3 {
    public static void main(String[] args) {
        /*
1. Numbers -- Prime Number
Write a method that can check if a number is prime or not
 */


        int number = 29;
        boolean isPrime =  isPrime(number);
        System.out.println(number + " is prime: " + isPrime);

    }
    public static boolean isPrime(int number) {
        /*define a method named "isPrime" that takes integer parameter representing the number to be checked. This method will return a boolean value indicating whether the number is prime or not.
         */


        if (number < 2) {// check the number is less than 2,as prime numbers are greater than or equal to 2.If the number is less than 2, return "false".since it can not be prime.
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }


}



//Another solution for task1



