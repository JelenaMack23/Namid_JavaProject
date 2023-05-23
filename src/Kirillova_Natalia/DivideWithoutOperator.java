package Kirillova_Natalia;

public class DivideWithoutOperator {


    public static void divideWithoutOperator(int n1, int n2){

        int result = 0;

        if (n2 ==0){
            System.out.println("Invalid divisor. Cannot be zero");
        }

        while(n1>= n2){
            n1=n1-n2; //26, 22, 18, 14, 10, 6
            result++;
        }

        System.out.println(result);

    }
    public static void main(String[] args) {

        int n1 = 26; //dividend
        int n2 = 9; //divisor


        int result = 0;//quotient
        int remainder = 0;


        if (n2 ==0){
            System.out.println("Invalid divisor. Cannot be zero");
        }

        while(n1>= n2){
           n1=n1-n2; //26, 22, 18, 14, 10, 6
           result++;
       }


        System.out.println("Result " + result);








    }
}
/*
Write a method that can divide two numbers without using division operator
 */