package week_4;

import java.util.Arrays;

public class Suraye {

    public static void main(String[] args) {

        //Remove Duplicates
        String str1 = "suraye1suraye2suraye3suraye4";

        String result = ""; // initialize an empty string

        // for loop
        for (int i = 0; i < str1.length(); i++) {// initialization starts at index 0 and runs until the end of string length

            if (result.contains("" + str1.charAt(i))) { // if the character is already contained in new string
                continue; // skip it
            }
            result += str1.charAt(i); // concatenates the current character to the existing string

        }
        System.out.println(result);

        System.out.println("---------------------");

        //Frequency of Characters

        String str2 = "AAaaaBBbbbCCcccDDdddEEeeeFFfffGGgggHHhhh";
        String frequency = frequencyOfChars(str2);
        System.out.println(frequency);


        System.out.println("---------------------");

        //Same Letters
        String str3 = "heart";
        String str4 = "earth";

        boolean result1 = checkSameLetters(str3, str4);
        System.out.println(result1);

    }
    public static String frequencyOfChars(String str){

        String res=""; // empty string

        for (int i = 0; i < str.length(); i++) {// // initialization starts at index 0 and runs until the end of string length
            char ch=str.charAt(i); //frequency of each character from string
            int count=0;

            for (int j = 0; j < str.length(); j++) {//I use inner loop to find the frequency of each character
                if(str.charAt(j)==ch){ // if character 'j' is equal to ch, the count is incremented
                    count++;
                }
            }
            if(res.contains(""+ch)){//we use outer loop to avoid duplicate characters,'contains' only accepts string, so we concatenate "" to char
                continue; //skip  the duplicated character, if the character is already included in the result
            }
            res +=ch+""+count; // concatenate character
        }
        return res;
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
