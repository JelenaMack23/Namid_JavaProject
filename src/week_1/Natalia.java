package week_1;

public class Natalia {

    public static void main(String[] args) {

        System.out.println(divideWithoutOperator(58,2));

    }


    public static int divideWithoutOperator(int n1, int n2){
                                         //dividend, divisor
        int result = 0; //quotient

        // int remainder = 0; ?????????


        if (n2 ==0){
            throw new ArithmeticException("Invalid divisor. Cannot be zero");
        }

        while(n1>= n2){
            n1=n1-n2; //26, 22, 18, 14, 10, 6
            result++;
        }


        return result;


    }


}