package week_7;

import java.util.ArrayList;
import java.util.Arrays;

public class Michael {
    public static void main(String[] args) {

        int[] arr1 = {0, 25, 45, 98, 124, -125};
        System.out.println( "Min value_1"+  minValue_1(arr1));

        System.out.println("min value_2= "+minValue_2(arr1));

       sortingArrayAsc(arr1);
       sortingArrayDesc(arr1);



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

    public static void sortingArrayAsc(int[] arr) {
        ArrayList<Integer> list = new ArrayList();
        for(int each: arr) {
            list.add(each);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        System.out.println("Sorted array in ascending order: "+Arrays.toString(arr));
        for(int i=0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

    }

    public static void sortingArrayDesc(int[] arr) {
        ArrayList<Integer> list = new ArrayList();
        for(int each: arr) {
            list.add(each);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        for(int i=0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        System.out.println("Sorted Array in Decending order: "+Arrays.toString(arr));
    }


}
