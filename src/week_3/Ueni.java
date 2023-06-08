package week_3;

public class Ueni {

    public static void main(String[] args) {


        isPrimeNumber(31);
        isPrimeNumber(10);
        isPrimeNumber(12);
        isPrimeNumber(7);
        isPrimeNumber(49);

        System.out.println(reverseNegative(-35));
        System.out.println(reverseNegative(-90));

    }


    public  static void isPrimeNumber(int number){
                /*
Write a method that can check if a number is
prime or not

         */
        boolean isPrime = true;
        //only can be divisible by 1 or by himself
        for (int i = 2; i <number ; i++) {
            if (number%i==0){
                isPrime = false;
                break;

            }else{
                isPrime = true;

            }
        }
        System.out.println( number +" " + isPrime);
    }

    public  static  int reverseNegative (int number){
        /*2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int

ex -56       = -65
 */
        int n = number;
        String convert ="";
        String reverse = "-";
        if (number<0) {
            convert = String.valueOf(n);

        }

        for (int i = convert.length()-1; i >0 ; i--) {

            reverse += convert.charAt(i);

        }

        n = Integer.parseInt(reverse);

         return n;

    }




}
