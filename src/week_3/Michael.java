package week_3;

public class Michael {
    public static void main(String[] args) {
        primeNumber(-5);
        primeNumber(5);
        primeNumber(10);

        reverseNegativeNum(-8964);

    }
    public static boolean primeNumber(int num) {

        if(num <= 1){
            System.out.println("Number 1 and numbers below 1 cannot be prime number.");
            return false;
        }

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                System.out.println("Number is not a prime number.");
                return false;
            }
        }
        System.out.println("Number is a prime number.");

        return true;

    }
    public static int reverseNegativeNum(int  num) {
        String str = new StringBuilder(""+num).reverse().toString();
        if(num < 0) {
            str = "-"+str.substring(0, str.length()-1);
        }
       int result = Integer.valueOf(str);
        System.out.println("Result= "+result);
        return result;
    }


}
