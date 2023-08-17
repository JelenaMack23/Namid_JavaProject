package week_9;

import java.util.ArrayList;
import java.util.Arrays;

public class Piri9 {

    // Method to concatenate two arrays.
        public static int[] concatArrays(int[] arr1, int[] arr2) {
            int[] result = new int[arr1.length + arr2.length];
            System.arraycopy(arr1, 0, result, 0, arr1.length);
            System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
            return result;
        }

        // Method to remove all occurrences of "Ahmed" from an ArrayList
        public static ArrayList<String> removeAhmed(ArrayList<String> names) {
            names.removeIf(name -> name.equals("Ahmed"));
            return names;
        }

        // Method to remove all values greater than 100 from an ArrayList of Integers
        public static ArrayList<Integer> removeGreaterThan100(ArrayList<Integer> numbers) {
            numbers.removeIf(number -> number > 100);
            return numbers;
        }

        public static void main(String[] args) {
            // Test concatArrays method
            int[] arr1 = {1, 2, 3};
            int[] arr2 = {4, 5, 6};
            int[] concatenatedArray = concatArrays(arr1, arr2);
            System.out.println("Concatenated Array: " + Arrays.toString(concatenatedArray));

            // Test removeAhmed method
            ArrayList<String> namesList = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Michael", "Ahmed"));
            ArrayList<String> filteredNames = removeAhmed(namesList);
            System.out.println("Filtered Names: " + filteredNames);

            // Test removeGreaterThan100 method
            ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 2, 50, 100, 150, 200, 300));
            ArrayList<Integer> filteredNumbers = removeGreaterThan100(numbersList);
            System.out.println("Filtered Numbers: " + filteredNumbers);
        }
    }

/*
concatArrays method:
This method takes two integer arrays (arr1 and arr2) as input and returns a new array that is the concatenation of the two input arrays. The method follows these steps:

It calculates the length of the resulting concatenated array by adding the lengths of both input arrays: arr1.length + arr2.length.
It creates a new integer array (result) with the calculated length.
It copies the elements from arr1 into result, starting at index 0 of result, using System.arraycopy.
It then copies the elements from arr2 into result, starting at the position after the last element of arr1.
Finally, it returns the resulting result array, which contains all the elements of arr1 followed by all the elements of arr2.
removeAhmed method:
This method takes an ArrayList of strings (names) as input and removes all occurrences of the string "Ahmed" from it. The method follows these steps:

It uses the removeIf method of ArrayList, which takes a predicate (lambda expression) as an argument to determine whether an element should be removed or not.
The predicate checks if the name is equal to "Ahmed" using the equals method, and if it is, it removes the element from the ArrayList.
After removing all occurrences of "Ahmed", the method returns the modified names ArrayList.
removeGreaterThan100 method:
This method takes an ArrayList of integers (numbers) as input and removes all values greater than 100 from it. The method follows these steps:

Similar to the removeAhmed method, it uses the removeIf method of ArrayList, along with a predicate (lambda expression).
The predicate checks if the number is greater than 100 using the number > 100 condition, and if it is, it removes the element from the ArrayList.
After removing all the values greater than 100, the method returns the modified numbers ArrayList.
 */
