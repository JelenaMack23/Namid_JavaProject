package week2;

public class Dmitrii {

    public static void Swap(int a, int b){
        a+=b;
        b=a-b;
        a-=b;
        System.out.println("a = " + (a)+", b = " + (b));
    }

    public static void main(String[] args) {
        Swap(5,6);
        Swap(-5,-6);
        Swap(5,-6);
        Swap(-5,6);
        Swap(0,-6);
        Swap(-5,0);
    }
}
