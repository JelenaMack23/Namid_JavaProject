package Nina_Mujezinovic;


public class DivideWithoutDivision {

    public static int DivideWithoutDivision(int a, int b) {
        int res = 0;

        // in cass that we have 0
        if (a == 0)
            return 0;
        if (b == 0)
            throw new ArithmeticException("Yon can not divide by 0");

        // store sign of the result, in case we have negative number
        int sign = 1;
        if (a * b < 0){
            sign = -1;
        }

        // covert to positive numbers so we can perform while loop
        a = Math.abs(a);
        b = Math.abs(b);


        while (a >= b) {
            a = a - b;// a=30 b= 4 then a = 30-4 ; a = 26
            res++;
        }
        System.out.println("And the remain is: " + a);

            return sign * res;
    }

    public static void main(String[] args) {
        int a = -30;
        int b = 4;
        System.out.println(DivideWithoutDivision(a,b));
    }

}