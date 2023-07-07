package week_7;

import java.util.Arrays;

public class Piri7 {

        public static int findMinimum(int[] arr) {
            if (arr == null || arr.length == 0) {
                throw new IllegalArgumentException("Array must not be empty or null");
            }

            int min = arr[0]; // Assume the first element is the minimum

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i]; // Update the minimum value
                }
            }

            return min;
        }

        public static int[] sortAscending(int[] arr) {
            if (arr == null || arr.length <= 1) {
                return arr; // Array is already sorted or empty
            }

            boolean swapped;
            do {
                swapped = false;
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] > arr[i + 1]) {
                        // Swap elements
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                        swapped = true;
                    }
                }
            } while (swapped);

            return arr;
        }

        public static int[] sortDescending(int[] arr) {
            if (arr == null || arr.length <= 1) {
                return arr; // Array is already sorted or empty
            }

            boolean swapped;
            do {
                swapped = false;
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] < arr[i + 1]) {
                        // Swap elements
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                        swapped = true;
                    }
                }
            } while (swapped);

            return arr;
        }

        public static void main(String[] args) {
            int[] arr1 = {5, 9, 3, 1, 7};
            int min = findMinimum(arr1);
            System.out.println("Minimum number: " + min); // Output: Minimum number: 1

            int[] arr2 = {10, 9, 8, 7};
            arr2 = sortAscending(arr2);
            System.out.println("Sorted array (ascending): " + Arrays.toString(arr2)); // Output: Sorted array (ascending): [7, 8, 9, 10]

            int[] arr3 = {10, 20, 7, 8, 90};
            arr3 = sortDescending(arr3);
            System.out.println("Sorted array (descending): " + Arrays.toString(arr3)); // Output: Sorted array (descending): [90, 20, 10, 8, 7]
        }
    }


