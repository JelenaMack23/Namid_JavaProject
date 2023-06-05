package week_2;

public class Piri2 {
    public static void Swap(int a, int b) {

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swapping the values without a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

/*
In this approach, the addition and subtraction operations are used to swap the values. The logic is as follows:

Add a and b, and assign the result back to a. Now, a contains the sum of the original values of a and b.
Subtract the original value of b (before swapping) from a, and assign the result back to b. This assigns the original value of a to b.
Finally, subtract the original value of a (before swapping) from b, and assign the result back to a. This assigns the original value of b to a.
After these steps, the values of a and b are swapped without using a third variable.

 */

    public static void DivisibleNumbers(int a, int b) {
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


    public static void CodilityTestCoders(int n){
        String res="";

        for (int i = 1; i <=n ; i++) {
            if (i%2==0 & i%3==0 & i%5==0){
                res+="CodilityTestCoders"+"\n";
            } else if (i%2==0 & i%3==0) {
                res+="CodilityTest"+"\n";
            } else if (i%2==0 & i%5==0) {
                res+="CodilityCoders"+"\n";
            } else if (i%3==0 & i%5==0) {
                res+="TestCoders"+"\n";
            } else if (i%2==0) {
                res+="Codility"+"\n";
            } else if (i%3==0) {
                res+="Test"+"\n";
            } else if (i%5==0) {
                res+="Coders"+"\n";
            }else {
                res+=i+"\n";
            }
        }
        System.out.println(res);

    }

    public static void main(String[] args) {
        Swap(10,20);
        Swap(6,8);
        Swap(-10,20);
        Swap(8,6);
        System.out.println("----------------");


        DivisibleNumbers(1, 100);

        System.out.println("--------------");

        CodilityTestCoders(24);
    }

}













