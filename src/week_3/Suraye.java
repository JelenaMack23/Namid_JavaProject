package week_3;

public class Suraye {

    public static void main(String[] args) {

        //1. Numbers -- Prime Number
        // Write a method that can check if a number is prime or not

        int range = 25; // maximum value up to which prime numbers are checked
        for (int j = 2; j <= range; j++) { // iterate from 2 to the value of 'range'
            if (isPrime(j)) {//checks if the current # is prime
                System.out.print(j + ", ");//prints the prime # and comma after
            }
        }


        //2. Numbers -- Reverse negative number
        //Write a return method that can reverse negative number and return it as int

        int number = -56;// assigned negative variable
        int reversed = reverseNegative(number);
        System.out.println("Reversed number: " + reversed);
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {//Checks if the number n is less than or equal to 1
            return false;//returns false since prime numbers are greater than 1
        }
        if (n == 2) {//'n' is equal to 2, which is a prime number
            return true;
        }
        if (n % 2 == 0) {//if 'n' is divisible by 2. If so, it returns 'false' since even numbers (except 2) are not prime
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {//Starts a loop that iterates from 3 to the square root of 'n' or less, incrementing by 2 in each iteration. This ensures that only odd numbers are checked as potential divisors
            if (n % i == 0) {//Checks if the current number i divides n evenly
                return false;//it means 'n' is divisible by a number other than 1 and itself, making it not prime
            }
        }
        return true; //After the loop ends, it means no divisors were found, and the number 'n' is prime.
    }

    public static int reverseNegative(int number) {
        if (number >= 0) {// checks if the input # is non-negative
            return number; // Return the number as it is if it is non-negative
        } else {
            int reversedNumber = 0; // initialize a variable 'reversedNumber'
            int tempNumber = -number; // Convert to positive number for reversal

            while (tempNumber > 0) { // starts a loop that iterates until 'tempNumber' becomes 0
                int digit = tempNumber % 10; // Extract the last digit, modulo gives the remainder by dividing by 10
                reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
                tempNumber /= 10; // Move to the next digit
            }

            reversedNumber *= -1; // Add the negative sign back

            return reversedNumber;
        }
    }
}
