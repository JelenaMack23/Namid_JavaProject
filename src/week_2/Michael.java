package week_2;

public class Michael {
    public static void main(String[] args) {
        System.out.println("Hi friends, we're gonna share our solution for the second week Java Tasks in this Package.");
        System.out.println("Don't forget to push and update daily!!!");
        System.out.println("We need ever group member to execute the cycle...");

        swapingNumbers(10,20);
        divisibleBy(55);
        printingConsequtiveNumbers(100);
    }

    public  static void swapingNumbers(int a, int b){


        System.out.println("a="+a+" and b="+b+" before swap.");
        System.out.println("===========================================================================");
        a = a +b;
        b = a - b;
        a = a - b;

        System.out.println("a="+a+" and b="+b+" after swap.");

    }

    public static void divisibleBy(int num1) {
        String divisibleBy15 ="";
        String divisibleBy5 ="";
        String divisibleBy3="";
        int[] arr = new int[num1];
        for(int i=0; i < arr.length; i++)
            arr[i] = i+1;

        for(int each: arr) {
            if(each %15==0 && each %3==0)
                divisibleBy15+= each+" ";
            if(each %5==0 && each % 15!=0)
                divisibleBy5 += each+" ";
            if(each%3==0 && each %15!=0)
                divisibleBy3 += each+" ";
        }
        System.out.println("Divisible By 15: "+divisibleBy15);
        System.out.println("Divisible By 5: "+divisibleBy5);
        System.out.println("Divisible By 3: "+divisibleBy3);
    }


    public static void printingConsequtiveNumbers(int N) {
        String result = "";
        for (int i = 1; i <= N; i++) {
            if(i %2 ==0 && i%3 == 0 && i %5==0)
                result += "CodilityTestCoders\n";
            else if(i %2 ==0 && i%3 == 0)
                result += "CodilityTest\n";
            else if(i % 2==0 && i %5==0)
                result += "CodilityCoders\n";
            else if(i % 3 == 0 && i % 5 ==0)
                result +="TestCoders\n";
            else if(i % 2 ==0)
                result += "Codility\n";
            else if (i % 5 == 0)
                result += "Coders\n";
            else if (i % 3 == 0)
                result += "Test\n";
            else
                result += i + "\n";
        }

        System.out.println(result);
    }


}
