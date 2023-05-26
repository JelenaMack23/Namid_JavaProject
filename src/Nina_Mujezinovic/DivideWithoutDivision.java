package Nina_Mujezinovic;


public class DivideWithoutDivision {

    public static double DivideWithoutDivision(int a, int b) {
        double res = 0;

        if (a == 0)
            return 0;
        if (b == 0)
            throw new ArithmeticException("Yon can not divide by 0");

        while (a >= b) {
            a = a - b;// a=30 b= 4 then a = 30-4 ; a = 26
            res++;
        }

        boolean isNegative = (a < 0 && b > 0 || a > 0 && b < 0);

            if (isNegative)
                res = -res;

            return res;
    }

    public static void main(String[] args) {
        int a = -30;
        int b = 4;
        System.out.println(DivideWithoutDivision(a,b));
    }

}