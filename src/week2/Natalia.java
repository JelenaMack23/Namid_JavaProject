package week2;

public class Natalia {

    public static void main(String[] args) {


        swapTwoNumbers(25,10);
        divisibleBy3_5_15();
        consecutiveNumbers(24);

    }



    public static void swapTwoNumbers(int num1, int num2){
        //swap numbers

        num1 = num2 + num1; //num1 = 10+25 (35)
        num2 = num1 - num2; //num2 = 35-10 (25)
        num1 = num1 - num2; //num1 = 35-25 (10)

        System.out.println(num1 + ", " + num2);
    }


    public static void divisibleBy3_5_15() {

        String dBy3515 = "";
        String dBy3 = "";
        String dBy5 = "";


        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {
                dBy3515 += i + " ";
            } else if (i % 3 == 0 && !(i % 15 == 0)) {
                dBy3 += i + " ";
            } else if (i % 5 == 0 && !(i % 15 == 0)) {
                dBy5 += i + " ";
            }

        }

        System.out.print("Divisible By 15: " + dBy3515 + "\n");
        System.out.print("Divisible By 3: " + dBy3 + "\n");
        System.out.print("Divisible By 5: " + dBy5 + "\n");


        //3. Numbers -- print consecutive numbers


    }


    public static void consecutiveNumbers(int num) {

        if (num < 0) {
            throw new ArithmeticException("number cannot be negative");
        }

        String divBy2 = "Codility";
        String divBy3 = "Test";
        String divBy5 = "Coders";

        for (int i = 1; i < num; i++) {

            if (i % 2 == 0) {
                System.out.println(divBy2);
            } else if (i % 3 == 0) {
                System.out.println(divBy3);
            } else if (i % 5 == 0) {
                System.out.println(divBy5);
            } else {
                System.out.println(i);
            }

            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(divBy2 + divBy3);
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(divBy3 + divBy5);
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println(divBy2 + divBy5);

            }


        }


    }






















}
/*

 */