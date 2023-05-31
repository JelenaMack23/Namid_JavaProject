package week_2;

public class Jelena2 {


        public static void main(String[] args) {

            /*
Swap two variable values without using a third variable
 */

            int a = 10;
            int b = 20;

            a = a + b;  // a is ab
            b = a - b;  //  a is ab and - b we have only a left, so b = a
            a = a - b;  //  a is ab and - new b which is a now we have only b left, so a = b


            System.out.println("a is = " + a);
            System.out.println("b is = " + b);




        }


    }







