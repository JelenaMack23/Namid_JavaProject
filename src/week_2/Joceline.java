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
    }
}
