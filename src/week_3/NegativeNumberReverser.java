package week_3;

public class NegativeNumberReverser {
    public static void main(String[] args) {
        int number = -123;
        int reversedNumber = reverseNegativeNumber(number);
        System.out.println("Reversed number: " + reversedNumber);
    }

    public static int reverseNegativeNumber(int number) {
        if (number < 0) {
            // Multiply by -1 to reverse the sign
            return number * -1;
        }
        return number;
    }
}
