package week_10;

import java.util.*;

public class Dmitrii {

    public static void main(String[] args) {

        ArrayList<String> arrString=new ArrayList<>();
        arrString.addAll(Arrays.asList("Java", "Python", "Ruby", "C++", "Solidity"));
        ArrayList<Integer> arrInteger=new ArrayList<>(Arrays.asList(18,25,54,5,15,10));

        Map<String,String> mapOfStrStr=new LinkedHashMap<>();
        mapOfStrStr.put("Java","Wooden spoon");
        mapOfStrStr.put("Python","Silver spoon");
        mapOfStrStr.put("Ruby","Plastic spoon");
        mapOfStrStr.put("C++","Platinum spoon");
        mapOfStrStr.put("Solidity","Aluminium spoon");

        System.out.println("========================= TASK # 1 ================================");

        Dmitrii.arraySortAscen(arrString);
        Dmitrii.arraySortAscen(arrInteger);

        System.out.println("========================= TASK # 2 ================================");
        Dmitrii.arraySortDescen(arrString);
        Dmitrii.arraySortDescen(arrInteger);

        System.out.println("========================= TASK # 3 ================================");

        Dmitrii.sortMap(mapOfStrStr);

    }
//    ArrayList - sorting in ascending
//    Write a method that can sort the ArrayList in Ascending order without using
//    the sort method.

    public static <T> void arraySortAscen(ArrayList<T> arr){
        Set<T> sortedSet=new TreeSet<>();
        for (T each : arr) {
            sortedSet.add(each);
        }
        ArrayList<T> result=new ArrayList<>();
        for (T each : sortedSet) {
            result.add(each);
        }

        System.out.println(result);
    }

//    ArrayList - sorting in descending order
//    Write a method that can sort the ArrayList in descending order without
//    using the sort method.

    public static <T> void arraySortDescen(ArrayList<T> arr){
        Set<T> sortedSet=new TreeSet<>();
        for (T each : arr) {
            sortedSet.add(each);
        }
        ArrayList<T> result=new ArrayList<>();
        for (T each : sortedSet) {
            result.add(each);
        }
        ArrayList<T> resultDesc=new ArrayList<>();
        for (int i = result.size() - 1; i >= 0; i--) {
            resultDesc.add(result.get(i));
        }

        System.out.println(resultDesc);

    }

    /*  Map - Sort the map by values
    Write a method that can sort the Map by values.  */

    public static <K, V extends Comparable<V>> void sortMap(Map<K,V> map){
        List<Map.Entry<K, V>> entryList = new ArrayList<>(map.entrySet());

        Collections.sort(entryList, (entry1, entry2) -> {
            return entry1.getValue().compareTo(entry2.getValue());
        });

        LinkedHashMap<K, V> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println(sortedMap);

    }
}
