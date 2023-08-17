package week_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Zehra {

    // Task 1: Array - Concat two arrays
    public static int[] concatenateArrays(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        int[] result = new int[length1 + length2];

        // Copy elements from the first array
        for (int i = 0; i < length1; i++) {
            result[i] = array1[i];
        }

        // Copy elements from the second array
        for (int i = 0; i < length2; i++) {
            result[length1 + i] = array2[i];
        }

        return result;
    }

    // Task 2: ArrayList - Remove "Ahmed"
    public static List<String> removeAhmedNames(List<String> names) {
        List<String> result = new ArrayList<>();

        for (String name : names) {
            if (!name.equals("Ahmed")) {
                result.add(name);
            }
        }

        return result;
    }

    // Task 3: ArrayList - Remove some values
    public static List<Integer> removeValuesGreaterThan100(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();

        for (Integer number : numbers) {
            if (number <= 100) {
                result.add(number);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Task 1: Array - Concat two arrays
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] concatenatedArray = concatenateArrays(array1, array2);
        System.out.println("Task 1 - Concatenated Array:");
        System.out.println(Arrays.toString(concatenatedArray));

        // Task 2: ArrayList - Remove "Ahmed"
        List<String> namesList = new ArrayList<>();
        namesList.add("Ahmed");
        namesList.add("John");
        namesList.add("Eric");
        namesList.add("Ahmed");
        List<String> filteredNames = removeAhmedNames(namesList);
        System.out.println("\nTask 2 - Filtered Names:");
        for (String name : filteredNames) {
            System.out.println(name);
        }

        // Task 3: ArrayList - Remove some values
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(200);
        numbersList.add(3);
        numbersList.add(150);
        List<Integer> filteredNumbers = removeValuesGreaterThan100(numbersList);
        System.out.println("\nTask 3 - Filtered Numbers:");
        for (Integer number : filteredNumbers) {
            System.out.println(number);


        }
    }
}

/*
Task1
This method takes two integer arrays as input, array1 and array2, and returns an integer array as output.
It calculates the lengths of the two input arrays and creates a new integer array named result with the length equal to the sum of the lengths of array1 and array2.
The method then uses two for loops to copy elements from the first and second arrays to the result array.
The first loop copies elements from array1 to the result array starting from index 0.
The second loop copies elements from array2 to the result array starting from the index length1 in the result array, so that the elements from array2 are placed after the elements from array1.
Finally, the method returns the result array, which is the concatenated array containing elements from both input arrays.

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

 Task2:
 This method takes a list of strings, names, as input and returns another list of strings as output.
It creates a new ArrayList named result, which will store the names after removing all occurrences of "Ahmed".
The method iterates through each name in the input names list using a for-each loop.
Inside the loop, it checks if the current name is NOT equal to "Ahmed" using the equals method. If the condition is true, it means the name is not "Ahmed," so it adds it to the result list using the add method.
After processing all the names, the method returns the result list, which contains the names with "Ahmed" removed.

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
Task3:

 This method takes a list of integers, numbers, as input and returns another list of integers as output.
It creates a new ArrayList named result, which will store the numbers after removing all values greater than 100.
The method iterates through each number in the input numbers list using a for-each loop.
Inside the loop, it checks if the current number is less than or equal to 100. If the condition is true, it means the number is not greater than 100, so it adds it to the result list using the add method.
After processing all the numbers, the method returns the result list, which contains the numbers with values not greater than 100.
In the main method, we demonstrate the usage of these methods by calling them with sample inputs and printing the results for each task. The output will display the concatenated array, the filtered names (with "Ahmed" removed), and the filtered numbers (with values greater than 100 removed).

 */
