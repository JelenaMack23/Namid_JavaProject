package week_7;

import java.util.Arrays;

public class Michael {
    public static void main(String[] args) {

        int[] arr1 = {0, 25, 45, 98, 124, -125};
        System.out.println( "Min value_1"+  minValue_1(arr1));

        System.out.println("min value_2= "+minValue_2(arr1));
    }

    public static int minValue_1(int[] n) {
        int min = Integer.MAX_VALUE;
        for (int each : n)
            if (each < min)
                min = each;

        return min;
    }

    public static int minValue_2( int[]  n ) {
        Arrays.sort( n );
        return  n [ 0 ];
    }


}
