package week_3;

public class Nina {

    //Write a method that can check if number is prime or not
    public static void primeNumber(int num) {
        if ((num % 2 == 0 && num != 2) ||
                (num % 3 == 0 && num != 3) || (num % 5 == 0 && num != 5) || (num % 7 == 0 && num != 7) || (num % 11 == 0 && num != 11)) {
            System.out.println(num + " num is not prime number");
        }else{
            System.out.println(num+ " num is prime number");
        }

    }

    public static void main(String[] args) {
        primeNumber(2);
        primeNumber(10);
        primeNumber(26);
        primeNumber(43);
        primeNumber(81);

    }
}
