package week_7;

import java.util.Arrays;

public class Jelena {

      /*
    Question1: Array - Find Minimum
Write a method that can find the maximum number from an int Array

Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
 arr = Sort(arr); ==>{ 7, 8, 9, 10};

Question3: Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
 arr = Sort(arr); ==> {90, 20, 10, 8, 7};
     */

    public static void main(String[] args) {

        System.out.println("========================= TASK # 1 ================================");
        int[] arr={2,-5,19,100,18, 4,0, -1};
        System.out.println("ArrayMaximum(arr) = " + maxNumArray(arr));
        System.out.println("========================= TASK # 2 ================================");

        int[] arr2 = {10,20,7, 8, 90};

        System.out.println("arrayAscendingOrder(arr2) = " + Arrays.toString(arrayAscendingOrder(arr2)));



        System.out.println("========================= TASK # 3 ================================");

    }

    public static int maxNumArray(int[] arr){
        int max=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }

        return max;
    }

    public static int[] arrayAscendingOrder(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {

            int max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[max]){
                    max = j;
                }
            }
            int temp = arr[i]; // use temporary variable
            // swap variables
            arr[i] = arr[max];
            arr[max] = temp;

        }

        return arr;
    }




}
