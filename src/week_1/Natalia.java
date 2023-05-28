package week_1;

public class Natalia {

    public static void main(String[] args) {

        System.out.println(divideWithoutOperator(58,2));
        oddOrEven(60);
        oddOrEven(55);
        finra();



    }


    public static int divideWithoutOperator(int n1, int n2){
                                         //dividend, divisor
        int result = 0; //quotient




        if (n2 ==0){
            throw new ArithmeticException("Invalid divisor. Cannot be zero");
        }

        while(n1>= n2){
            n1=n1-n2; //26, 22, 18, 14, 10, 6
            result++;
        }


        return result;


    }

    public static void oddOrEven (int num){

        if (num<0){
            System.out.println("cannot be negative");
        }
        if (num%2==0){
            System.out.println(num+ " is even number");
        }else {
            System.out.println(num+ " is odd number");
        }
    }


    public static void finra(){

        for (int i = 1; i < 31 ; i++) {


            if (i % 3 ==0 && i % 5==0){
                System.out.print(" FINRA ");
            } else if (i % 3 ==0) {
                System.out.print(" FIN ");
            } else if (i % 5 ==0) {
                System.out.print(" RA ");
            }else {
                System.out.print(" " + i + " ");

            }

        }


    }



}
/*
FINRA :
Write a method which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3print "FIN" instead of the number and for numbers which are a
multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
both 3 and 5, print "FINRA" instead of the number.
 */