package Suraye_Bayram;

public class EvenAndOdd {

    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        int num1 = 34;
        int num2 = 35;

        System.out.println(checkEvenOrOdd(num1));
        System.out.println(checkEvenOrOdd(num2));
    }
}
