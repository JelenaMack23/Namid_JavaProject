package Kirillova_Natalia;

public class OddOrEven {

    public static boolean isOdd(int num){
        if (num % 2 != 0){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isEven(int num){
        return !isOdd(num);

    }

}
/*
Write a method which can identifies given number is even or odd

ex:
    identify(5) -> "Odd"
    identify(6) -> "Even"

 */