package week2;

public class Natalia {

    public static void main(String[] args) {


        swapTwoNumbers(25,79);
        divisibleBy3_5_15();
        consecutiveNumbers(24);

    }


    // 1. swap two variable' values without using a third variable


    //2. write a program that can print the numbers between 1~100 that can be divisible by 3,5 and 15.
    //   if the number can be divisible by 3,5 and 15 then it should be displayed in DivisibleBy15 section
    //   if the number can be divisible by 3 but cannot be divisible by 15, then it should ONLY be
    //   displayed in DivisibleBy3 section
    //   if the number can be divisible by 5 but cannot be divisible by 15, then it should ONLY be
    //   displayed in DivisibleBy5 section
    // ex:
    //    Divisible By 15 15 30 45 60 75 90
    //    Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
    //    Divisible By 3 .....

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