package week_2;

public class Joceline {
    //Hello again
    public static void main(String[]args){

        System.out.println("Before swapping");
        int x = 10;
        int y = 20;

        System.out.println("Value of x:" + x);
        System.out.println("Value of y:" + y);
        System.out.println("After swapping");

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("Value of x:" + x);
        System.out.println("Value of y:" + y);

        System.out.println("------------------------------------------");

        String divisibleBy3 = "";
        String divisibleBy5 = "";
        String divisibleBy15 ="";

        for (int i=1; i<100; i++){
            if(i%3==0){
                divisibleBy3 += i+" ";
                System.out.println("Divisible by 3: "+divisibleBy3 );

            }
        }


        for (int i=1; i<100; i++){
            if(i%5==0){
                divisibleBy5 += i+" ";
                System.out.println("Divisible by 5: "+divisibleBy5 );

            }
        }

        for (int i=1; i<100; i++){
            if(i%15==0){
                divisibleBy15 += i+" ";
                System.out.println("Divisible by 15: "+divisibleBy15 );

            }
        }





    }



}
