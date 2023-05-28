package week_1;

public class Suraye {

    public static void main(String[] args) {

        int num1 = 34;
        int num2 = 35;

        System.out.println(checkEvenOrOdd(num1));
        System.out.println(checkEvenOrOdd(num2));

        System.out.println(DivideWithoutOperator(24,7));

        printFINRA();

    }

    public static String DivideWithoutOperator (int num1, int num2){
        int result = 0;

        while (num1-num2 >= 0){ // subtract num2 from num1
            result++; // increments
            num1-=num2; // stops subtracting than num1 is less than num2
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

    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
