package week_3;

import java.util.Scanner;

public class Joceline {
    public static void main(String[] args) {

     /*
       Numbers -- Reverse negative number
       Write a return method that can reverse
        negative number and return it as int

      */
        int num = -56;
        int rev = 0;

        while (num!=0){
            rev = rev*10+num%10;//0*10+ (-56%10)// 0 +(-5.6)  -0.56
            num = num/10; //-56/10 = -5.6

        }
        System.out.println("Reverse number is:"+rev);

        System.out.println("____________________________________________");

/*
        . Numbers -- Prime Number
        Write a method that can check if a number is
        prime or not

 */

        Scanner Scan = new Scanner(System.in);
        int number = Scan.nextInt();
        System.out.println(number);

        if(number%1==number&&number%number==1){
            System.out.println(number + "is a prime number");
        }
    }
}
