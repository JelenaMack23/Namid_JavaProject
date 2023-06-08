package week_3;

public class Jelena {

    public static void main(String[] args) {

        primeNum(1);
        primeNum(5);
        primeNum(13);
        primeNum(10);
        primeNum(16);
        primeNum(21);

    }

    public static void primeNum(int a) {
        if ((a % 2 == 0 && a != 2) || (a % 3 == 0 && a != 3) || (a % 5 == 0 && a != 5) || (a % 7 == 0 && a != 7) || (a % 11 == 0 && a != 11)) {
            System.out.println(a + " is NOT a prime number");
        } else {
            System.out.println(a + " is a prime number");
        }
    }
}
