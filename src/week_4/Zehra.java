package week_4;

import java.util.Arrays;

public class Zehra {
    public static void main(String[] args) {
        /*
        /*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */


        String str = "AAABBCDD";
        String frequency = frequencyOfChars(str);
        System.out.println(frequency);

        System.out.println("-----------------------");
        //task 2
        String a = "java";
        String b = "avaj";
        System.out.println(same(a, b));

        System.out.println("-------------------------");

        //task3
        String str1 = "AAABBBCCC";

        System.out.println(removeDuplicates(str1));
    }

    public static String frequencyOfChars(String str) {

        String res = "";
        //Initializing empty store our result that will contain frequency of characters

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); //frequency of each character from string
            int count = 0;

            for (int i = 0; i < str.length(); i++) {//to find the frequency of each character
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            if (res.contains("" + ch)) {//contains only accepts string so we concat "" to char
                continue; //skip  the duplicated character, if the character is already included in the result
            }
            res += ch + "" + count;
        }
        return res;
    }

    public static boolean same(String a, String b) {// I converted string (a, b) to char array
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a1 = "", a2 = ""; // to store our result assigned emty string
        for (char each : ch1)
            a1 += each;

        for (char each : ch2)
            a2 += each;

        return a1.equalsIgnoreCase(a2);
    }

    public static String removeDuplicates(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) { //i: index numbers of str

            char each = str.charAt(i);   // each character of the String str

            if (!result.contains("" + each)) { // if the string result does not contain the character of string str yet
                result += each; // then we will add the character to string result
            }
            // if the character is not contained yet in the new string, then we will add it to the new string

        }


        return result;


    }


}
