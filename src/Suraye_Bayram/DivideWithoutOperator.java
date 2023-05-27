package Suraye_Bayram;

public class DivideWithoutOperator {

    public static String DivideWithoutOperator (int num1, int num2){
        int result = 0;

        while (num1-num2 >= 0){ // subtract num2 from num1
            result++; // increments
            num1-=num2; // stops subtracting than num1 is less than num2
        }
        return result + " remainder " + num1;
    }

    public static void main(String[] args) {
        System.out.println(DivideWithoutOperator(24,7));
    }
}
