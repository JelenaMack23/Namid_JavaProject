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


        int  a = -29;
        System.out.println(rev(a));
    }
    public static boolean isPrime(int number) {
        /*define a method named "isPrime" that takes integer parameter representing the number to be checked. This method will return a boolean value indicating whether the number is prime or not.*/

/*
        if (number < 2) {// check the number is less than 2,as prime numbers are greater than or equal to 2.If the number is less than 2, return "false".since it can not be prime.
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;
      */

        // Second solution of task 1
        int count = 0;
        boolean isPrime = true;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                count = count + 1;
            }
        }
        if (count <= 2) {
            return isPrime;
        }

        return false;

    }
/*

2. Numbers -- Reverse negative number
Write a return method that can reverse negative number and return it as int
 */

    public static int rev(int a) {
        int b = a * (-1);
        String c = "" + b;
        //System.out.println(c);
        int length = c.length();
        //System.out.println(length);
        int res = 0;
        if (a >= 0) {
            System.out.println(a + " is not a negative number");
            System.exit(1);
        } else {
            String d = "";
            for (int i = length - 1; i >= 0; i--) {

                d = d + "" + c.charAt(i);
                //System.out.println(d);

            }
            int e = Integer.parseInt(d);
            int f = e * (-1);
            //System.out.println(f);
            res = f;
        }
        return res;

    }



}






