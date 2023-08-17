package week_9;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public class Dmitrii {

    public static void main(String[] args) {
        System.out.println("========================= TASK # 1 ================================");
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8,9,10};
        System.out.println(Arrays.toString(Dmitrii.concat(arr1, arr2)));
        String[] arr3={"Java","JS","Ruby"};
        String[] arr4={"C++","Phyton","C#", "Solidity"};
        System.out.println(Arrays.toString(Dmitrii.concat(arr3, arr4)));

        System.out.println("========================= TASK # 2 ================================");
        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Dmitrii", "Muhtar"));
        Dmitrii.removeAhmed(names);



        System.out.println("========================= TASK # 3 ================================");
        ArrayList<Integer> arr=new ArrayList<>();
        arr.addAll(Arrays.asList(85,11,24,66,48,71,57, 5,23, 44));
        Dmitrii.removeInt(arr,50);

       /* Longest Repetitive Substring -- Real Interview Task


        - Write a program if some substring K that can be repeated N>1 times to produce the input string exactly as it appears.
        - Your program should return longest substring K, and
        - if there is none it should be return "There is no repetitive substring"

        For Example
        str ="abcababcababcab"             output should be abcab
        str ="abcdefabcdef"                output should be abcdef

        str ="abcdefabcdefabcdefabcdef"     output should be abcdefabcdef
        str ="abcdefxabcdef"           output should be "There is no repetitive substring"
        */

        String str ="abcababcababcab";



        boolean isSubstring=true;
        String subStr="";
        for (int i = 1; i <= str.length()/2; i++) { // i=2
            subStr=str.substring(0,i);     // ab

            for (int j = i; j < str.length()-i; j+=i) { // начинаем с i так как проверяем оставшийся String,
                // str.length()-i так как надо уменьшать каждый раз String иначе Index out of bound
                // j+=i чтоб не упустить случаи когда substring начинается с определенной позиции которую мы пропустили бы если j++.
                if (!str.substring(j,j+i).equals(subStr)){
                    isSubstring=false;
                    break;
                }

            }

        }
        if (isSubstring) {
            System.out.println("K = " + subStr);
        }else {
            System.out.println("There is no repetitive substring");
        }



/*
for (int len = 1; len <= n / 2; len++) {
            String substring = input.substring(0, len);
            boolean isRepetitive = true;

            for (int i = len; i <= n - len; i += len) {
                if (!input.substring(i, i + len).equals(substring)) {
                    isRepetitive = false;
                    break;
                }
            }
 */






    }

    // 1) Array - Concat two arrays
    // Write a return method that can concate two arrays
    public static int[] concat(int[] arr1,int[] arr2 ){
        int[] res=new int[arr1.length+arr2.length];
        for (int i = 0, j=0; i < arr1.length;i++) {
            res[j++]=arr1[i];
        }
        for (int i = 0, j=arr1.length; i < arr2.length; i++) {
            res[j++]=arr2[i];
        }
        return res;
    }
    public static String[] concat(String[] arr1,String[] arr2){
        String[] res=new String[arr1.length+arr2.length];
        for (int i = 0, j=0; i < arr1.length;i++) {
            res[j++]=arr1[i];
        }
        for (int i = 0, j=arr1.length; i < arr2.length; i++) {
            res[j++]=arr2[i];
        }
        return res;
    }

    //2) ArrayList - Remove "Ahmed"
    //Given a list of people's names: "Ahmed", "John", Eric", "Ahmed".....
    //Write a java operation to remove all the names named Ahmed

    public static void removeAhmed(AbstractList<String> names){

        names.removeIf(p->p=="Ahmed");
        System.out.println(names);
    }
    //3) ArrayList - Remove some values
    //Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

    public static void removeInt(ArrayList<Integer> arr, int number){

        arr.removeIf(p->p>number);
        System.out.println(arr);
    }



}








