package week_2;

public class Nina {
    public static void main(String[] args) {

        int a = 5;
        int b = 15;

         a = a + b;  // a + b = 20
         b = a - b;  // b 20 - 15 = 5
         a = a - b;  // a  20 - 5 = 15

        System.out.println("A is: " + a );
        System.out.println("B is: " + b);


        System.out.println("---------------------------");

        // Task numbers--divisible by 3,5,15


        String divisibleBy_3_5_15 = "";
        String divisibleBy_3 = "";
        String divisibleBy_5 = "";


        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {
                divisibleBy_3_5_15 += i + " ";
            } else if (i % 3 == 0 && !(i % 15 == 0)) {
                divisibleBy_3 += i + " ";
            } else if (i % 5 == 0 && !(i % 15 == 0)) {
                divisibleBy_5 += i + " ";
            }

        }

        System.out.print("Divisible By 15: " + divisibleBy_3_5_15 + "\n");
        System.out.print("Divisible By 3: " + divisibleBy_3 + "\n");
        System.out.print("Divisible By 5: " + divisibleBy_5 + "\n");


    }
}
