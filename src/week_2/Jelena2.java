package week_2;

public class Jelena2 {


    public static void main(String[] args) {

        consecutiveNumber(24);

            /*
Swap two variable values without using a third variable
 */

        int a = 10;
        int b = 20;

        a = a + b;  // a is ab
        b = a - b;  //  'a' is ab and - b we have only a left, so b = a
        a = a - b;  //  'a' is ab and - new b which is a now we have only b left, so a = b


        System.out.println("a is = " + a);
        System.out.println("b is = " + b);

        System.out.println("-------------------------------------------------------------------------");

        System.out.print("Divisible by 15 ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {
                System.out.print(i + " ");
            }

        }

        System.out.print("\nDivisible by 3 ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 15 != 0) {
                System.out.print(i + " ");

            }
        }

        System.out.print("\nDivisible by 3 ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 15 != 0) {
                System.out.print(i + " ");

            }
        }


    }

    public static void consecutiveNumber(int N) {

        for (int i = 1; i <= N; i++) {

            if (i % 2 == 0) {
                System.out.println("Codility");
            } else if (i % 3 == 0) {
                System.out.println("Test");
            } else if (i % 5 == 0) {
                System.out.println("Coders");
            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("CodilityTest");
            } else if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println("CodilityTestCoders");
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("CodilityCoders");
            } else {
                System.out.println(i);
            }


        }
    }

}



