package week_8;

import java.util.Arrays;

public class Suraye {
        public static int[] generateArray ( int N){
            // Check if N is within the valid range, if not throw an 'IllegalArgumentException'
            if (N < 1 || N >= 100) {
                throw new IllegalArgumentException("N should be between 1 and 99");
            }

            //create an array 'arr' of size 'N' to store the generated numbers
            int[] arr = new int[N];

            // used loop to populate the array with values that sum up to zero
            for (int i = 0; i < N; i++) {

                // Assign values based on a simple arithmetic calculation
                // Subtract N/2 from each index to ensure the sum of the elements is zero
                arr[i] = i - (N / 2);
            }

            // Return the generated array
            return arr;
        }

    public static void moveZeros(int[] nums) {
        int count = 0; // counter to keep track of the position for non-zero elements

        // used for loop to iterate through elements of array to move non-zero elements to the front of the array
        for (int num : nums) {
            if (num != 0) {
                nums[count++] = num; // Move non-zero element to the current count position and increment count
            }
        }

        // used while loop to fill remaining indexes with zeros
        while (count < nums.length) {
            nums[count++] = 0; // Fill current count position with zero and increment count
        }
    }

        public static void main (String[]args){

            // Array - N unique integers that sum up to 0

            // Define the size of the array
            int N = 4;

            // Generate the array of N unique integers that sum up to zero
            int[] arr = generateArray(N);

            // Print the contents of the generated array
            System.out.println(Arrays.toString(arr));

            System.out.println("----------------------------------------------");

            //Array - Move Zeros to the End

            int[] nums = {0, 4, 0, 9, 0, 0, 2, 0, 5}; //[4, 9, 2, 0, 0, 0, 0, 0] since we didn't use sorted method, numbers will not be in sorted order

            // Move zeros to the end of the array
            moveZeros(nums);

            // Print the modified array
            System.out.println(Arrays.toString(nums)); //converted array numbers into a string

        }
    }




/*
 1. Array - N unique integers that sum up to 0
    Write a function that given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
    The function can return any such array.
    For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
    The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).

 2. Array - Move Zeros to the End
    Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
    Ex: input: {1,0,2,0,3,0,4,0};
        output: [1, 2, 3, 4, 0, 0, 0, 0]
 */