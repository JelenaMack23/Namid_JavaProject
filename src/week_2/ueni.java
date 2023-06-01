package week_2;

public class ueni {

    public static void main(String[] args) {

        //Divisible by 3,5,15

        String by15 = "";
        String by5 = "";
        String by3 = "";


        for (int i = 1; i <=100; i++) {

            if(i % 3 == 0 && i % 5 == 0 && i % 15 == 0 ){
               by15 += i+" ";

            }
             if(i % 5 == 0 && i % 15 != 0  ) {
                 by5 += i + " ";
             }

            if(i % 3 == 0 && i % 15 != 0 ){

                by3 += i + " ";

            }

        }

        System.out.println("Divisivle by 15 " +by15);
        System.out.println("Divisivle by 5 " +by5);
        System.out.println("Divisivle by 3 " +by3);


        System.out.println("-----------------------------------------------");




     swapTask(5,3);

     System.out.println("-----------------------------------------");

     consecutiveTask(24);


    }

    public static void swapTask(int x, int y){


        x=y+x;
        y=x-y;
        x=x-y;
        System.out.println("x="+x);
        System.out.println("y="+y);


    }



    public static void consecutiveTask(int n) {

        for (int i = 1; i <= n; i++) {



            if(i%2==0 && i%3==0&&i%5==0){
                System.out.println("CodilityTestCoders");

            } else if (i%2==0 && i%3==0) {
                System.out.println("CodilityTest");


            }else if(i%2==0&&i%5==0){
                System.out.println("CodilityCoders");

            }else if(i%3==0 & i%5==0){
                System.out.println("TestCoders");

            }else if(i%2==0){
                System.out.println("Codility");
            }else if(i%3==0){
                System.out.println("Test");

            } else if (i%5==0) {
                System.out.println("Coders");
            }else {
                System.out.println(i);
            }


        }

    }



}