package Suraye_Bayram;

public class FINRA {

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

    public static void main(String[] args) {
        printFINRA(); // will print numbers that are not divisible by 3 and 5, or print "FIN", "RA", or "FINRA" if numbers are divisible by 3 and 5.
    }
}
