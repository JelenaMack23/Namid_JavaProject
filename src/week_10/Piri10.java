package week_10;

import java.util.*;

public class Piri10 {
    public static void main(String[] args) {
        // Sorting ArrayList in Ascending Order
        ArrayList<Integer> numbersAscending = new ArrayList<>();
        numbersAscending.add(6);
        numbersAscending.add(3);
        numbersAscending.add(8);
        numbersAscending.add(1);

        sortAscending(numbersAscending);
        System.out.println("Sorted ArrayList in Ascending Order: " + numbersAscending);

        // Sorting ArrayList in Descending Order
        ArrayList<Integer> numbersDescending = new ArrayList<>();
        numbersDescending.add(5);
        numbersDescending.add(2);
        numbersDescending.add(8);
        numbersDescending.add(1);

        sortDescending(numbersDescending);
        System.out.println("Sorted ArrayList in Descending Order: " + numbersDescending);

        // Sorting Map by Values
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Eve", 20);
        map.put("David", 35);

        Map<String, Integer> sortedMap = sortByValues(map);
        System.out.println("Sorted Map by Values: " + sortedMap);
    }

    public static void sortAscending(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    public static void sortDescending(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    public static Map<String, Integer> sortByValues(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}

/*
explanation:
1,We create an ArrayList called numbersAscending that will hold a collection of integers. Then, we add four integers to this list: 5, 2, 8, and 1....

We create an ArrayList called numbersAscending that will hold a collection of integers. Then, we add four integers to this list: 5, 2, 8, and 1.

This method is defined to sort an ArrayList in ascending order. The actual sorting logic, which involves comparing and swapping elements, is not shown in your provided code but is expected to be implemented here.

2,We do something similar for the numbersDescending ArrayList, where we create the list and add the same integers to it.

We call the sortDescending method to sort the numbersDescending ArrayList in descending order. After sorting, we print the sorted list.

Similarly, this method is defined to sort an ArrayList in descending order. The specific sorting algorithm's implementation (like bubble sort, selection sort, etc.) is expected to be placed within this method.




 3,We create a HashMap named map to store name-age pairs. Each name is a key, and the associated age is the value.
We call the sortByValues method to sort the map by its values. After sorting, we print the sorted map.

This method is intended to sort a Map by its values. The sorting is achieved by converting the Map's entries into a list, sorting the list based on the values, and then constructing a new sorted Map using the sorted lis
 */





