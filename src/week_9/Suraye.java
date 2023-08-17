package week_9;

import java.util.ArrayList;
import java.util.Arrays;

public class Suraye {
    public static void main(String[] args) {
        // TASK 1
        int[] arr1 = {11,12,13,14,15};
        int[] arr2 = {16,17,18,19,20};
        // combine two arrays
        int[] concatenatedArr = concatArr(arr1,arr2);
        System.out.println(Arrays.toString(concatenatedArr));

        System.out.println("--------------------------------");

        String[] arr3 = {"Zehra", "Sergei", "Dmitrii","Jelena", "Piri"};
        String[] arr4 = {"Joceline", "Suraye", "Natalia", "Nina", "Ueni"};

        String[] concatenatedArr2 = concatenatedArr2(arr3,arr4);
        System.out.println(Arrays.toString(concatenatedArr2));

        System.out.println("--------------------------------");


        //  TASK 3
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3,6,22,44,122,444,2,45,555,33,333));

        // Call the custom method to remove values greater than 100

        removeValue(list,100);
        System.out.println(list);

        System.out.println("--------------------------------");

        // TASK 2

        ArrayList<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        removeAhmed(nameList,"Ahmed");
        System.out.println(nameList);



    }

    //1) Array - Concat two arrays
    //Write a return method that can concatenate two arrays
    public static int[] concatArr(int[] arr1, int[] arr2) {
        // calculate total of two array lengths
        int totLen = arr1.length + arr2.length;
        // new array for concatenated arrays
        int[] resultArr = new int[totLen];

        for (int i = 0; i < arr1.length; i++) {
            resultArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            resultArr[arr1.length+i] = arr2[i];// copy elements of array2 starting from where array 1 stopped
        }

        return resultArr;

    }

    public static String[] concatenatedArr2(String[] arr3, String[] arr4){
        int totRes = arr3.length + arr4.length;

        String[] resArr = new String[totRes];

        for (int i = 0; i < arr3.length; i++) {
            resArr[i] = arr3[i];
        }

        for (int i = 0; i < arr4.length; i++) {
            resArr[arr3.length + i] = arr4[i];
        }
        return resArr;
    }


    //2) ArrayList - Remove "Ahmed"
    //Given a list of people's names: "Ahmed", "John", Eric", "Ahmed"..... Write a java operation to remove all the names named Ahmed
    public static void removeAhmed(ArrayList<String> list, String nameToRem){
        // Lambda expression checks if the name equals "Ahmed", and if it does, the name is removed from the list.
        list.removeIf(p->p.equals(nameToRem));
    }



    //3) ArrayList - Remove some values
    //Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
    public static void removeValue(ArrayList<Integer> list, int num){
    // Iterate through the list in reverse order
        for (int i = list.size()-1; i >=0 ; i--) {
        // Check if the current element is greater than the num(100)
            if (list.get(i)>num) {
            // If yes, remove the element at index i
             list.remove(i);
        }

    }
}





}
