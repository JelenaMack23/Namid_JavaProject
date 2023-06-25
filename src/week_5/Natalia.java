package week_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Natalia {
    public static void main(String[] args) {

        System.out.println(reverseString("hsdjTDSA56789"));
        System.out.println(reverseString("Natalia"));
        System.out.println(reverseString("1234567890"));


        System.out.println(findUnique("aaaaaaaGGGGGGGjgfIIII"));


    }


    /*
String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
*/
    public static String findUnique(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i); //

            if (str.indexOf(each) == str.lastIndexOf(each)){
                result += each;
            }
        }

        return result;



    }




public static String reverseString(String str){

    String result = "";

    for (int i = str.length() -1; i >= 0 ; i--) {
        result += str.charAt(i);
    }
    return  result;

}
/*
String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
 */




}
