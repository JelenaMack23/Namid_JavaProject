package week_5;

public class Zehra {

    ///*
    //
    //  Task1:  String -- Find the unique
    //  Write a return method that can find the unique characters from the String Ex: unique("AAABBBCCCDEF") ==> "DEF";

    public static void main(String[] args) {


        String str1 = "abbbvcccddd";
        System.out.println("findTheUnique(str) = " + findTheUnique(str1));


        //write a return  method that can reverse String
        String str2 = "apple";
        System.out.println("reverseString(str) = " + reverseString(str2));
    }

    public static String findTheUnique(String str) {
        String unique = "";//initialize empty string to store the unique characters found in input string

        for (int i = 0; i < str.length(); i++) { // i index number of str, iterate over each character in input string
            char each = str.charAt(i);//within the loop, the code retrieves the character at the current index i using the charAt method and assigns it to the variable each.
            if (str.indexOf(each) == str.lastIndexOf(each)) {//The code then checks if the index of the first occurrence of each in str is equal to the index of the last occurrence of each in str. If they are equal, it means that each appears only once in the string, making it a unique character.
                unique += each;//If each is determined to be a unique character, it is concatenated to the unique string using the += operator.

            }
        }
        return unique;//After the loop completes, the unique string will contain all the unique characters found in the original string.
        // Finally, the method returns the unique string.

    }

    //Task2:
    //  String -- Reverse
    //  Write a return method that can reverse String Ex: Reverse("ABCD"); ==> DCBA
    //
    //     */


    public static String reverseString(String str) {

        String reverse = "";
//The reverseString method takes a string (str) as input and returns the reversed version of the string.

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
            //The method uses a for loop to iterate over the characters of the input string in reverse order. It starts from the last character (index str.length() - 1) and continues until the first character (index 0).
        }
        return reverse;
        //After the loop completes, the reverse string contains the reversed version of the input string, and it is returned from the method.
    }


}






