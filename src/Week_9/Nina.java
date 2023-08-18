package Week_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.AbstractList;


public class Nina {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {7, 8, 9, 10};
        int[] arrConcat = Nina.concat(arr1, arr2);
        System.out.println(Arrays.toString(arrConcat));

        System.out.println("--------------------------");

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Michael", "Ahmed"));
        ArrayList<String> Names = removeAhmed(namesList); //create new array list that will be called 'names'. And i will call a method that will remove nameList on top
        System.out.println("Filtered names " + Names); //and i will call a method that will remove nameList on top
    }

    /*ArrayList-concat two arrays
    Write a return method that can concate two arrays */
    public static int[] concat(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];
        for (int i = 0, j = 0; i < arr1.length; i++) {
            res[j++] = arr1[i]; //first loop will add integers from first array to the result
        }
        for (int i = 0, j = arr1.length; i < arr2.length; i++) {
            res[j++] = arr2[i]; /// //second ;oop add integers from second array to the result
        }
        return res;

    }

    /* Task2
    ArrayList-Remove "ahmed"
    Given a list of people 'names: "Ahmed","John","Eric,"Ahmed"..... Write a java operation to remove all the names Ahmed
     */


    // Method to remove all occurrences of "Ahmed" from an ArrayList
    public static ArrayList<String> removeAhmed(ArrayList<String> names) { //that method will accept arrayList of Strings
        names.removeIf(name -> name.equals("Ahmed")); // here I'm gonna call  list of names and i will remove the name if the name is Ahmed
        return names;
        //
    }



    }


