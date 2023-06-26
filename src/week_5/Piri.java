package week_5;

public class Piri {
    public static void main(String[] args) {
        String input = "AAABBBCCCDEF";

                // Find unique characters
                String uniqueChars = findUnique(input);
                System.out.println("Unique characters: " + uniqueChars);

                // Reverse string
                String reversedString = reverseString(input);
                System.out.println("Reversed string: " + reversedString);
            }

            public static String findUnique(String input) {
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < input.length(); i++) {
                    char currentChar = input.charAt(i);
                    if (input.indexOf(currentChar) == input.lastIndexOf(currentChar)) {
                        result.append(currentChar);
                    }
                }
                return result.toString();
            }

            public static String reverseString(String input) {
                StringBuilder reversed = new StringBuilder();
                for (int i = input.length() - 1; i >= 0; i--) {
                    reversed.append(input.charAt(i));
                }
                return reversed.toString();
            }
        }


/*
String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA

We start by defining the main method, which serves as the entry point for our program.
Inside the main method, we declare a String variable named input and assign it the value "AAABBBCCCDEF". This will be the input string for both methods.
We call the findUnique method, passing the input string as an argument. The findUnique method is responsible for finding the unique characters in the string and returning them as a new string.
Inside the findUnique method, we create a StringBuilder named result to store the unique characters. We iterate over each character in the input string using a for loop.
For each character, we check if its first occurrence is the same as its last occurrence in the input string. If it is, then the character is unique, and we append it to the result StringBuilder.
Once we have iterated over all characters in the input string, we return the result StringBuilder as a string using the toString() method.
Back in the main method, we store the returned string from findUnique in the uniqueChars variable and print it to the console.
Next, we call the reverseString method, passing the input string as an argument. The reverseString method is responsible for reversing the characters in the string and returning the reversed string.
Inside the reverseString method, we create a StringBuilder named reversed to store the reversed string. We iterate over the characters in the input string in reverse order using a for loop.
For each character, we append it to the reversed StringBuilder.
Once we have iterated over all characters in the input string, we return the reversed StringBuilder as a string using the toString() method.
Back in the main method, we store the returned string from reverseString in the reversedString variable and print it to the console.
So, in summary, the program first finds the unique characters in the input string using the findUnique method and prints them. Then it reverses the input string using the reverseString method and prints the reversed string.
 */