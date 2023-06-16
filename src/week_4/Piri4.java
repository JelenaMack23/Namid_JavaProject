package week_4;

public class Piri4 {

        public static void main(String[] args) {
            String input1 = "AAABBCDD";
            String input2 = "abc";
            String input3 = "cab";
            String input4 = "abb";
            String input5 = "AAABBBCCC";

            System.out.println("Frequency of Characters:");
            System.out.println(frequencyOfChars(input1));

            System.out.println("\nCheck if two strings are built out of the same letters:");
            System.out.println(same(input2, input3)); // Expected output: true
            System.out.println(same(input2, input4)); // Expected output: false

            System.out.println("\nRemove duplicated values from a string:");
            System.out.println(removeDup(input5)); // Expected output: ABC
        }

        public static String frequencyOfChars(String str) {
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                int count = 1;
                char currentChar = str.charAt(i);

                while ((i + 1) < str.length() && str.charAt(i + 1) == currentChar) {
                    count++;
                    i++;
                }

                result.append(currentChar).append(count);
            }

            return result.toString();
        }

        public static boolean same(String str1, String str2) {
            if (str1.length() != str2.length())
                return false;

            int[] count = new int[26]; // Assuming only lowercase alphabetical characters

            for (int i = 0; i < str1.length(); i++) {
                count[str1.charAt(i) - 'a']++;
                count[str2.charAt(i) - 'a']--;
            }

            for (int value : count) {
                if (value != 0)
                    return false;
            }

            return true;
        }

        public static String removeDup(String str) {
            StringBuilder result = new StringBuilder();
            boolean[] visited = new boolean[256]; // Assuming ASCII characters

            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);
                if (!visited[currentChar]) {
                    visited[currentChar] = true;
                    result.append(currentChar);
                }
            }

            return result.toString();
        }
    }




