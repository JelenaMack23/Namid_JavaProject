package week_3;

public class Natalia {

    public static void main(String[] args) {

        primeNumber(3);
        primeNumber(7);
        primeNumber(56);
        primeNumber(89);
        primeNumber(2);
        primeNumber(17);
        primeNumber(82);
        primeNumber(77);
        primeNumber(35);


        System.out.println("reverseNegativeNumber(-25) = " + reverseNegativeNumber(-25));
        System.out.println("reverseNegativeNumber(-84) = " + reverseNegativeNumber(-84));
    }




    //1. Numbers - Prime numbers
    //Write a method that can check if a number is prime or not
    public static void primeNumber(int num){

        int factor = 0;

        if (num > 1) {

            for (int i = 1; i <= num; i++) {
                if(num%i==0){
                    factor+=1;
                }
            }

        }else {
            System.err.println("Number cannot be negative.");
            System.exit(1);
        }
        if (factor>2){
            System.out.println(num + " is composite number");
        }else {
            System.out.println(num + " is prime number");
        }
    }


    //2. Numbers - Reverse negative number
    //Write a return method that can reverse negative number and return it as int

    //ex: num= -56     result = -65


    public static int reverseNegativeNumber(int num){

        int reverse = 0;
        int remainder = 0;

        num = num * -1;

        do{
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;

        }while(num > 0);

        return reverse * -1;







    }




}

