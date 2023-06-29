package week_5;

import java.util.Arrays;
import java.util.Collections;

public class Michael {
    public static void main(String[] args) {
        findTheUnique_1("aaaabbbbeMlllCCC");
        findTheUnique_2("aaaabbbbeMlllCCC");

        strReverse_1("Group");
        reverse_2("Namid");

    }


    public static String findTheUnique_1(String str) {
        String[ ] arr=str.split("");
        String unique_1="";
        for(int j=0; j<arr.length; j++) {
            int num=0;
            for(int i=0; i<arr.length; i++ ) {
                if(arr[i].equals(arr[j]) )
                    num++;
            }
            if(num==1)
                unique_1+=arr[j];
        }
        System.out.println("unique1 = " + unique_1);
        return unique_1;
    }


    public static String findTheUnique_2(String str) {
        String unique_2 ="";
        for(String each : str.split(""))
            unique_2 +=(  (Collections.frequency(Arrays.asList(str.split("")), each)) ==1 ) ? each : "";

        System.out.println("unique_2 = " + unique_2);
        return unique_2;
    }


    public static String strReverse_1(String str) {
        String reverse_1="";
        for(int i=str.length()-1; i >= 0; i--)
            reverse_1 += str.toCharArray()[i];

        System.out.println("reverse_1 = " + reverse_1);
        return  reverse_1;
    }

    public  static String  reverse_2(String str) {

        String reverse_2= new StringBuffer(str).reverse().toString();
        System.out.println("reverse_2 = " + reverse_2);

        return reverse_2;
    }


}
