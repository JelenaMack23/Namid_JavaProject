package week_3;


public class Sergei {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If the number is divisible by any other number, it's not prime
            }
        }

        return true; // If the number is not divisible by any other number, it's prime
    }
}








