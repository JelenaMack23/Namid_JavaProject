package week_10;

import java.util.*;

public class Zehra {

    public static void main(String[] args) {
        ArrayList<Integer> numbersAscending = new ArrayList<>();
        numbersAscending.add(5);
        numbersAscending.add(2);
        numbersAscending.add(8);
        numbersAscending.add(1);
        numbersAscending.add(3);

        System.out.println("Original ArrayList (Ascending): " + numbersAscending);

        // Sort the ArrayList in ascending order
        ascendingSort(numbersAscending);

        System.out.println("Sorted ArrayList (Ascending): " + numbersAscending);

        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("apple", 5);
        unsortedMap.put("banana", 2);
        unsortedMap.put("cherry", 8);
        unsortedMap.put("date", 1);
        unsortedMap.put("grape", 3);


        System.out.println("Original Map: " + unsortedMap);

        // Sort the map by values
        Map<String, Integer> sortedMap = sortByValues(unsortedMap);

        System.out.println("Sorted Map by Values: " + sortedMap);
    }

    public static void ascendingSort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // Swap elements at positions j and j+1
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static Map<String, Integer> sortByValues(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

        entryList.sort(Map.Entry.comparingByValue());

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}
/*
Task1:

We import the ArrayList class from the java.util package.

In the main method, we create an ArrayList named numbers and add some integer values to it.

We then print the original ArrayList.

The ascendingSort method takes an ArrayList of integers as a parameter and performs a simple bubble sort algorithm to sort the elements in ascending order.

The outer loop runs from index 0 to list.size() - 1. This loop controls the number of passes needed for the sorting.

The inner loop runs from index 0 to list.size() - 1 - i. This loop compares adjacent elements and swaps them if they are out of order. The i is used to optimize the loop, as in each pass, the largest element will have bubbled up to the end of the list, so we don't need to compare and swap those elements again.

Inside the inner loop, we use an if statement to compare the current element at index j with the next element at index j + 1.

If the element at index j is greater than the element at index j + 1, we perform a swap using a temporary variable temp.

Finally, we print the sorted ArrayList.

This code uses a simple bubble sort algorithm to sort the ArrayList in ascending order. However, bubble sort is not the most efficient sorting algorithm for large lists. More advanced sorting algorithms like quicksort or mergesort are generally preferred for larger datasets due to their better performance.

Task2:



The setup and imports are similar to the previous example.

In the main method, we create an ArrayList named numbers and add some integer values to it.

We then print the original ArrayList.

The descendingSort method takes an ArrayList of integers as a parameter and performs a variation of the bubble sort algorithm to sort the elements in descending order.

The outer loop and inner loop structure are the same as in the ascending sort example. We are using the bubble sort algorithm here as well.

Inside the inner loop, we compare the current element at index j with the next element at index j + 1.

If the element at index j is less than the element at index j + 1, we perform a swap using a temporary variable temp.

The result is that larger elements "bubble up" towards the beginning of the ArrayList in each pass, leading to a descending order.

Finally, we print the sorted ArrayList in descending order.

Just like in the ascending sort example, it's important to note that bubble sort is not the most efficient sorting algorithm for larger datasets. More efficient algorithms such as quicksort or mergesort are generally preferred in practice for larger lists.

Task3:

We start by importing necessary classes including Map, List, ArrayList, HashMap, and LinkedHashMap from the java.util package.

In the main method, we create an unsorted HashMap named unsortedMap and add some key-value pairs to it.

We print the original unsorted map.

The sortByValues method takes a Map of strings to integers as a parameter and returns a new LinkedHashMap with the entries sorted by values in ascending order.

Inside the sortByValues method:

We create a List of Map.Entry objects from the entries of the input map. This allows us to work with individual entries and sort them based on their values.
We use the sort method of the entryList to sort the entries based on their values. We achieve this by calling Map.Entry.comparingByValue().
We create a new LinkedHashMap named sortedMap to store the sorted entries.
After sorting the entryList, we iterate through each entry and add them to the sortedMap.

Finally, we return the sortedMap from the sortByValues method.

In the main method, we call the sortByValues method and print the sorted map.

This code demonstrates how to sort a map by values using a List of Map.Entry objects and a LinkedHashMap to maintain the order of the sorted entries. Remember that the example uses ascending order sorting. If you want to sort the map in descending order, you can modify the entryList.sort line to use Map.Entry.comparingByValue(Comparator.reverseOrder()).
 */