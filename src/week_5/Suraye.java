package week_5;

public class Suraye {

    public static void main(String[] args) {

        //String -- Find the unique
        String str = "Suraye";
        String reverse = "";

        // Iterate over the characters of the input string in reverse order
        for(int i = str.length()-1; i >= 0; i--){ // starts at the last character of the string and continues until the first character // decrement after each iteration

            // Append the current character to the 'reverse' string
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);

        System.out.println("----------------------------");

        //String -- Reverse
        String str2 = "AAHaabcccd112334";
        String unique = "";  // initialize empty string


        for (int j = 0; j < str2.length(); j++) {//iterate over each character of the input string 'str'

            char ch = str2.charAt(j);// Select the character at index 'j' from 'str'

            int frequency =0;// Variable to keep track of the frequency of 'ch'

            for (int i = 0; i < str2.length(); i++) { // checks how many times the character has appeared in string
                if (str2.charAt(i) == ch) { // if the ch has appeared in the string
                    frequency++; // increase the frequency by 1
                }
            }
            if (frequency == 1){ // if the frequency in one, then it's unique
                unique += ch;
            }
        }
        System.out.println(unique);

    }
}
/*
#1
String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF"

#2
String -- Reverse
Write a return method that can reverse String Ex: Reverse("ABCD"); ==> DCBA
 */