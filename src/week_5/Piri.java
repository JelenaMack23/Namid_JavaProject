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
 */