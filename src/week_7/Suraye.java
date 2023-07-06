package week_7;

import java.util.Arrays;

public class Suraye {
    public static void main(String[] args) {

        System.out.println(" ");
        //Question1: Array - Find Minimum

        // create an array of integers
        int[] arr = {12, 34, 10, 38, 7};
        //            0   1   2   3  4

        // Call the findMinimum method to get the minimum number in the array
        int minimumNumber = findMinimum(arr);

        System.out.println("minimumNumber = " + minimumNumber);

        System.out.println(" ");
        System.out.println("-------------------------------");
        System.out.println(" ");

        //Question2: Array - Sort Ascending

        // create an array of integer
        int[] arr2 = {12, 34, 10, 38, 7};

        // sort the array in ascending order using the sortAscending method
        int[] sortedArr = sortAscending(arr2);

        System.out.println("Sorted Ascending Array = " + Arrays.toString(sortedArr));


        System.out.println(" ");
        System.out.println("-------------------------------");
        System.out.println(" ");

        //Question3: Array - Sort Descending

        // Declare and initialize the array
        int[] arr3 = {12, 34, 10, 38, 7};
        //             0   1   2   3  4

        // Sort the array in descending order using the sortDescending method
        arr3 = sortDescending(arr3);

        System.out.println("Sorted Descending Array = " + Arrays.toString(arr3));


    }

    public static int findMinimum(int[] arr) {

        // initialize the minimum number with the first element of the array
        int minimum = arr[0]; //12

        // iterate through the array elements starting from the second element by doing this I compare all elements of the array with the initial minimum value 12. If element is smaller than 12, it becomes new minimum.
        for (int i = 1; i < arr.length; i++) {
            // check if the current element is smaller than the current minimum
            if (arr[i] < minimum) {
                // update the minimum if the current element is smaller
                minimum = arr[i];
            }
        }
        return minimum;
    }
    
    public static int[] sortAscending(int[] arr2){
        
        //iterate through the array

        for (int i = 0; i < arr2.length-1; i++) {
            // Find the minimum element in the remaining unsorted portion of the array
            int minNum = i;
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[j] < arr2[minNum]){
                    minNum = j;
                }
            }

            // swap the minimum element with the current element

            int temp = arr2[i];//store value of 'i' temporarily in 'temp'
            arr2[i] = arr2[minNum];//swap the current element in 'arr2[i]' with minimum element found in 'arr2[minNum]'
            arr2[minNum] = temp;// the value stored temporarily in 'temp' to the 'arr2[minNum]'

        }
        return arr2;
    }

    public static int[] sortDescending(int[] arr3){
        // Iterate through the array. We use '-1' to compare the current element with the next element. When we come to the last element, we don't need to compare it with any other element since there are no elements after it.
        for (int i = 0; i < arr3.length; i++) {
            // Iterate through the remaining unsorted portion of the array
            //We use '-1' to compare the current element with the next element.
            //When we come to the last element, we don't need to compare it with any other element since there are no elements after it.
            //Using '-1' in inner loop will avoid unnecessary iteration.
            for (int j = i + 1; j < arr3.length-1; j++) {
                // Compare and swap elements if needed for descending order
                if (arr3[j] > arr3[i]) {
                    int temp = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j] = temp;
                }

            }
        }
        return arr3;
    }





}

/*
Question1: Array - Find Minimum
Write a method that can find the minimum number from an int Array

Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class

Ex: int[] arr = {10, 9, 8, 7};
    arr = Sort(arr); ==>{ 7, 8, 9, 10};

Question3: Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class

Ex: int[] arr = {10,20,7, 8, 90};
    arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */
