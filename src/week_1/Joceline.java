package week_1;

import java.text.DecimalFormat;

public class Joceline {
    public static double DivideWithoutDivision(int a, int b){

        double res=0;

        if (b == 0) {
            throw new ArithmeticException("Yon can not divide by 0");
        }

        boolean isNegative = (a<0 && b>0|| a>0&&b<0);

        a = Math.abs(a);
        b = Math.abs(b);

        while (a>=b){  // a=7. b=2
            a-=b;  //a=a-b  -> -15-4-=-18
            res++;
        }
        //    a=1, b=2 res=3

        a*=10; //a=a*10
        while (a>b){  //a=10
            a-=b;
            res+=0.1;
        }

        if (isNegative){
            res=-res;
        }
        return res;
    }

    public static String OddEven(int a){
        String result="Odd";
        if (a%2==0){
            result="Even";
        }
        return result;
    }

    public static String FINRA (int a){

        String res2="";
        for (int i = 1; i <= a; i++) {

            if(i%3==0 && i%5==0) {
                res2+="FINRA" + " ";
            }else if (i%3==0){
                res2+="FIN"+" ";
            } else if (i%5==0) {
                res2+="RA"+" ";
            }else {
                res2+=i+" ";
            }
        }
        return res2;
    }
    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("0.0");

        System.out.println(df.format(DivideWithoutDivision(9,3)));
        System.out.println(df.format(DivideWithoutDivision(10,3)));
        System.out.println(df.format(DivideWithoutDivision(-15,-4)));
        System.out.println(df.format(DivideWithoutDivision(-15,4)));
        System.out.println(df.format(DivideWithoutDivision(15,-4)));
        System.out.println(df.format(DivideWithoutDivision(0,4)));
        System.out.println(df.format(DivideWithoutDivision(4,0)));


        System.out.println(OddEven(5));
        System.out.println(OddEven(6));

        System.out.println(FINRA(30));


    }
}





