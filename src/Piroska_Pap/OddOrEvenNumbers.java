package Piroska_Pap;

public class OddOrEvenNumbers {
    public static void main(String[] args) {

        int num1 = 5;
        System.out.println(isEven(num1));
        int num2 =6;
        System.out.println(isEven(num2));
    }
    public static boolean isEven(int number){
        return number %2 ==0;
    }

}
