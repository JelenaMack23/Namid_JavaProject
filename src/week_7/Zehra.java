package week_7;

import java.util.Arrays;

public class Zehra {


        public static void main(String[] args) {
            int[] arr = { 10, 20, 7, 8, 90 };

//Inside the main method, I created an integer array 'arr' and then call the three methods one by one to perform the desired operations.
// I executed 3 different methods under main method in here!!

            // Question 1: Find Minimum
            int minimum = findMinimum(arr);
            System.out.println("Minimum number: " + minimum);

            // Question 2: Sort array in  ascending order
            int[] ascendingArray = sortAscending(arr);
            System.out.println("Ascending order: " + Arrays.toString(ascendingArray));

            // Question 3: Sort array in descending order
            int[] descendingArray = sortDescending(arr);
            System.out.println("Descending order: " + Arrays.toString(descendingArray));
        }

        public static int findMinimum(int[] arr) { //finds the minimum number from an integer array.
            int min = Integer.MAX_VALUE;
            for (int num : arr) {
                if (num < min) {
                    min = num;
                }
            }
            return min;
        }

        public static int[] sortAscending(int[] arr) { //sorts an integer array in ascending order.
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            return arr;
        }

        public static int[] sortDescending(int[] arr) { //sorts an integer array in descending order.
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            return arr;
        }
    }



    /*
 Question1: Array - Find Minimum
 Write a method that can find the maximum number from an int Array

Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};

Question3: Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
     */
