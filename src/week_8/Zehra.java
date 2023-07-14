package week_8;

import java.util.Arrays;

public class Zehra {


    public static int[] generateArray(int N) {
        //The generateArray method takes an integer N as input and returns an array of N unique integers that sum up to 0.

        int[] array = new int[N]; // Created array with a size of N to store the generated integers.
        int sum = 0; //Initialize a variable called sum to keep track of the cumulative sum of the array elements.

        for (int i = 0; i < N - 1; i++) { //Use a loop to assign values to the array elements. Iterate from 0 to N-1, excluding the last element.


            array[i] = i + 1;//Inside the loop, assign i + 1 to each element of the array. This ensures unique integers in the array.
            sum += array[i];
        }

        array[N - 1] = -sum; //Add the assigned value to the sum variable to keep track of the cumulative sum.

        return array; //Return the generated array.
    }

    public static void moveZerosToEnd(int[] array) { //The moveZerosToEnd method takes an integer  array as input and moves all the zeros to the end of the array.
        int count = 0;

        for (int i = 0; i < array.length; i++) { //Iterate through the array using a loop.

            if (array[i] != 0) {  //If the current element is not equal to zero, it means it's a non-zero element. In this case, assign it to the count index of the array and increment count by 1. This effectively moves non-zero elements towards the beginning of the array, maintaining their original order.
                array[count] = array[i];
                count++;
            }
        }

        while (count < array.length) {
            array[count] = 0;
            count++;
        }
    }

    public static void main(String[] args) {  //In the main method, you can test the generateArray function by calling it with a specific value of N and print the generated array.
        int N = 4;
        int[] result = generateArray(N);

        System.out.print("Generated array for N = " + N + ": ");
        for (int num : result) {
            System.out.print(num + " ");

            //In the main method as it is, it generates an array for N = 4 and prints the result like this: Generated array for N = 4: 1 2 3 -6


            // Task2: Move zeros to the end of the array
            int[] array = {1, 0, 2, 0, 3, 0, 4, 0};
            System.out.println("Original array: " + Arrays.toString(array));
            moveZerosToEnd(array);
            System.out.println("Array after moving zeros to the end: " + Arrays.toString(array));
            /*
            In the main method:
         Task1: Generate an array with N unique integers summing up to 0 by calling the generateArray method, and store the result in the generatedArray variable. Print the generated array using Arrays.toString().
        Task2: Initialize an array called array with the given input: {1, 0, 2, 0, 3, 0, 4, 0}. Print the original array. Call the moveZerosToEnd method to move the zeros to the end of the array. Print the array after moving zeros using Arrays.toString().
            */

        }

    }


}



/*

Task1:
Array - N unique integers that sum up to 0
Write a function that given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function can return any such array.
For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5]. The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).

Task2:
Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0, 0]
 */