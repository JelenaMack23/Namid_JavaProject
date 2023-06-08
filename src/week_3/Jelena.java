package week_3;

import java.util.prefs.PreferenceChangeEvent;

public class Jelena {

    public static void main(String[] args) {

        primeNum(1);
        primeNum(5);
        primeNum(13);
        primeNum(10);
        primeNum(16);
        primeNum(21);

        System.out.println(reverseNegative(-15));
        System.out.println(reverseNegative(-75));

    }

    public static void primeNum(int a) {
        if ((a % 2 == 0 && a != 2) || (a % 3 == 0 && a != 3) || (a % 5 == 0 && a != 5) || (a % 7 == 0 && a != 7) || (a % 11 == 0 && a != 11)) {
            System.out.println(a + " is NOT a prime number");
        } else {
            System.out.println(a + " is a prime number");
        }
    }

    public static int reverseNegative(int number) {
        /*2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int

ex -56       = -65
 */
        int n = number;
        String convert = "";
        String reverse = "-";
        if (number < 0) {
            convert = String.valueOf(n);

        }

        for (int i = convert.length() - 1; i > 0; i--) {

            reverse += convert.charAt(i);

        }

        n = Integer.parseInt(reverse);

        return n;

    }
}