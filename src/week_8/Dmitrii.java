package week_8;

import java.util.*;

public class Dmitrii {


        public static void main(String[] args) {
            System.out.println("========================= TASK # 1 ================================");

            System.out.println(Arrays.toString(uniqueArrayWithZeroSum(5)));

            System.out.println("========================= TASK # 3 ================================");
            int[] arr={1,0,2,0,3,0,4,0};
            System.out.println(Arrays.toString(arrayMoveZerosToEnd(arr)));
            int[] arr2={1,-5,2,4,8,0,0,0};
            System.out.println(Arrays.toString(arrayMoveZerosToEnd(arr2)));
        }

         /*Array - N unique integers that sum up to 0
    Write a function that given an integer N (1 < N < 100), returns an array
    containing N unique integers that sum up to 0. The function can return any
    such array.
    For example, given N = 4, the function could return [125,0, -127,2] or [-2,1, -4,5].
    The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1] (but there are many more
    correct answers).*/

        public static int[] uniqueArrayWithZeroSum(int n){
            int[] arr=new int[n];
            Set<Integer> set=new HashSet<>();
            if (n<=1 || n>=100){
                throw new IllegalArgumentException("n must be between 1 and 99");
            }
            Random random = new Random(); // create random object to call it methods

            while (set.size()<n-1){  // loop until we get a set n-1 length, because we will calculate last element to get sum==0
               set.add(random.nextInt(10));   // add unique random numbers to set
            }

            int sum =0;
            for (Integer each : set) {
                sum+=each;                 // calculate the sum of set elements
            }
            set.add(sum*(-1));  // add sum with the opposite sign to set

            // add element from set to array using loop
            int i=0;  // array index
            for (Integer eachSetElement : set) {
                arr[i++]= eachSetElement;
            }

           return arr;
        }

            /*Array - Move Zeros to the End
    Write a method that can move all the zeros to last indexes of the array
    (Do Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0, 0]
     */

    public static int[] arrayMoveZerosToEnd(int[] arr){
        int[] result=new int[arr.length-1];

        for (int i = 0, j=0; i < arr.length; i++) {
           if (arr[i]!=0){
               result[j++]=arr[i];
           }
        }

        return result;
    }



}
