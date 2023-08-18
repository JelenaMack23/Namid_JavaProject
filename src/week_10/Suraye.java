package week_10;

import java.util.*;

public class Suraye {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortAscending(23,4, 5, 19,0,3,21,9)));

        System.out.println("-----------------------------");

        System.out.println(Arrays.toString(sortDescending(23,4, 5, 19,0,3,21,9)));

        System.out.println("-----------------------------");

        Map<String, Integer> map = Map.of("m", 1, "a", 3, "s", 2,"e", 5, "y", 4 );
        System.out.println(sortByValue(map));
    }

    //ArrayList - sorting in ascending
    //Write a method that can sort the ArrayList in Ascending order without using the sort method.
    public static int[] sortAscending(int... arr) {
        // Outer loop for each element of the array
        for (int i = 0; i < arr.length; i++) {
            // Inner loop for comparing and swapping adjacent elements
            for (int j = 0; j < arr.length - 1; j++) {
                // Compare current element with the next element
                if(arr[j] > arr[j+1]){
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];// Store the current element in a temporary variable
                    arr[j] = arr[j+1];// Assign the value of the next element to the current element
                    arr[j+1]=temp;// Assign the value of the temporary variable to the next element

                }
            }
        }
        return arr;
    }

    //ArrayList - sorting in descending order
    //Write a method that can sort the ArrayList in descending order without using the sort method.
    public static int[] sortDescending(int... arr){
        // Outer loop for each element of the array
        for (int i = 0; i < arr.length; i++) {
            // Inner loop for comparing and swapping adjacent elements
            for (int j = 0; j < arr.length - 1; j++) {
                // Compare current element with the next element
                if (arr[j]<arr[j+1]){
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];// Store the current element in a temporary variable
                    arr[j] = arr[j+1];// Assign the value of the next element to the current element
                    arr[j+1] = temp;// Assign the value of the temporary variable to the next element
                }
            }
        }
        return arr;
    }



   // Map - Sort the map by values
   // Write a method that can sort the Map by values.
    public static Map<String, Integer> sortByValue(Map<String,Integer> map){
        // Creating a list of map entries from the input map

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        //sort the list of entries based on their values
        for (int i = 0; i < entries.size(); i++) {
            for (int j = 0; j < entries.size()-1; j++) {
                // Compare the values of two adjacent entries
                if (entries.get(j).getValue() > entries.get(j + 1).getValue()){
                    // Swap entries[j] and entries[j+1]

                    Map.Entry<String, Integer> temp = entries.get(j);
                    entries.set(j, entries.get(j+1));
                    entries.set(j+1, temp);
                }
            }
        }
        // Create a LinkedHashMap to maintain insertion order of sorted entries

        Map<String, Integer> sorted = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> each : entries){
            sorted.put(each.getKey(), each.getValue());
        }

        return sorted;

    }



}
