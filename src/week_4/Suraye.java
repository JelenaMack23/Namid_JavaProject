package week_4;

import java.util.Arrays;

public class Suraye {

    public static void main(String[] args) {

        //Remove Duplicates
        String str1 = "suraye1suraye2suraye3suraye4";

        String result = ""; // initialize an empty string

        // for loop
        for (int i = 0; i < str1.length(); i++) {

            if (result.contains("" + str1.charAt(i))) { // if the character is already contained in new string
                continue; // skip it
            }
            result += str1.charAt(i); // concatenates the current character to the existing string

        }
        System.out.println(result);

        System.out.println("---------------------");

        //Frequency of Characters

        String str2 = "aaabbbcccdddeeefffggghhh";
        char ch = 'a';

        int count = 0; // so it starts from zero

        for (int i = 0; i < str2.length(); i++) { // i: index numbers of str

            if (str2.charAt(i) == ch) { // if the character of the string is equal to the given character, it means the given character has appeared
                count++;
            }

        }

        System.out.println(count);

        System.out.println("---------------------");

        //Same Letters
        String str3 = "heart";
        String str4 = "earth";

        boolean result1 = checkSameLetters(str3, str4);
        System.out.println(result1);

    }

    public static boolean checkSameLetters(String str3, String str4){


        // Check if the lengths are equal
        if (str3.length() != str4.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] charArray1 = str3.toCharArray();
        char[] charArray2 = str4.toCharArray();

        // Sort character arrays to ensure letters are in the same order for comparison
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Check if the sorted arrays are equal
        return Arrays.equals(charArray1, charArray2);
    }

}
