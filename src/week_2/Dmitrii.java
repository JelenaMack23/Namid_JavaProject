package week_2;

public class Dmitrii {

    public static void Swap(int a, int b){
        a+=b;
        b=a-b;
        a-=b;
        System.out.println("a = " + (a)+", b = " + (b));
    }

    public static void DivisibleBy3_5_15(int a, int b){

        String d15="",d3="", d5="";

        for (int i = a; i <=b ; i++) {
            if (i%3==0&i%5==0&i%15==0){
                d15+=i+", ";
            }
            if (i%3==0& i%15!=0){
                d3+=i+", ";
            }
            if (i%5==0& i%15!=0){
                d5+=i+", ";
            }
        }
        System.out.println("In range between "+a+" and "+b+"\nNumbers divisible by 15: "+d15.substring(0,d15.length()-2)+"\nNumbers divisible by  5: "+d5.substring(0,d5.length()-2)+"\nNumbers divisible by  3: "+d3.substring(0,d3.length()-2));
    }

    public static void main(String[] args) {
        System.out.println("--------------------Task #1-------------------------------");
        Swap(5,6);
        Swap(-5,-6);
        Swap(5,-6);
        Swap(-5,6);
        Swap(0,-6);
        Swap(-5,0);

        System.out.println("--------------------Task #2-------------------------------");

        DivisibleBy3_5_15(1,100);

        System.out.println("--------------------Task #3-------------------------------");
    }
}
