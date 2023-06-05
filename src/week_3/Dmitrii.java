package week_3;

public class Dmitrii {

    public static void main(String[] args) {
        System.out.println("-----------Task 1 -----------------------------------" );

        PrimeNumber(1);
        PrimeNumber(2);
        PrimeNumber(3);
        PrimeNumber(4);
        PrimeNumber(5);
        PrimeNumber(6);
        PrimeNumber(7);
        PrimeNumber(8);
        PrimeNumber(9);
        PrimeNumber(10);
        PrimeNumber(11);
        PrimeNumber(22);
        PrimeNumber(15);

        System.out.println("-----------Task 2 . Solution 1 ----------------------" );

        System.out.println(Reverse(-12546));
        System.out.println(Reverse(12546));
        System.out.println(Reverse(0));

        System.out.println("-----------Task 2 . Solution 1 ----------------------" );

        System.out.println(Reverse2(-12546));
        System.out.println(Reverse2(12546));
        System.out.println(Reverse2(0));

    }

    public static void PrimeNumber(int a){
        if ((a%2==0 && a!=2) ||(a%3==0 && a!=3)|| (a%5==0 && a!=5) || (a%7==0 && a!=7)|| (a%11==0 && a!=11) ){
            System.out.println(a+ " is NOT a prime number");
        } else {
            System.out.println(a+ " is a prime number");
        }
    }

    public static int Reverse(int a){

        boolean sign=false;

        if (a<0){
            sign=true;
            a = -a;
        }

        String strA=String.valueOf(a);   //  convert int to String

        String result="";

        for (int i = strA.length()-1; i >= 0; i--) {
            result+=strA.charAt(i);
        }

        int reverseA=Integer.parseInt(result); //  convert String to int

        if (sign){
            reverseA = -reverseA; // change a sign
        }

        return reverseA;
    }

    public static int Reverse2(int a){

        int b=Math.abs(a);  // absolut value of a
        int count=1;

        //  using loop for counting how many numbers "int a"  has
        for (int i = 0; i < b; i++) {  //i=0, b=123
            b=b/10;                    // b=12
            if (b>0){                  //12>0
                count++;               //count==2
            }else {
                break;
            }
        }

        int reverse=0;

         for (int i = count-1; i >= 0; i--) { // using for reverse "int a"

            int remainder=a % 10; //  remainder is a last digit of "a"

            reverse+=remainder*Math.pow(10, i);  // add to reverse whole numbers like 4000, 300, 20, 1, using exponential

            a=a/10;  // for next loop iteration  a must has -1 digit : 1234->123
         }

     return reverse;
    }

}
