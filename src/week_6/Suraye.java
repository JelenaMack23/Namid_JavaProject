package week_6;

public class Suraye {

    public static void main(String[] args) {
        //Password Validation Task

        // Test the password validation method
        String password1 = "Suraye3!"; // valid password
        String password2 = "suray"; // invalid password (less than 6 characters)
        String password3 = "Suraye"; // invalid password (no special character or digit)

        System.out.println(isPasswordValid(password1));
        System.out.println(isPasswordValid(password2));
        System.out.println(isPasswordValid(password3));

        System.out.println("---------------------------------------");

        int[] numbers = {7, 10, 38, 12, 34};
        Integer maxNumber = findMaxNum(numbers);

        //Find Maximum

        // Check if a maximum number was found
        if (maxNumber != null) {
            System.out.println("The maximum number is: " + maxNumber);
        } else {
            System.out.println("No maximum number found.");
        }

        System.out.println("---------------------------------------");

        //sum of digits in a string

        String input = "SurayeBayram88";
        int digitSum = sumDigit(input);
        System.out.println("Sum of digits: " + digitSum);
    }

    public static boolean isPasswordValid(String password) {
        // Check if password has at least 6 characters and does not contain space
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // Check if password contains at least one uppercase letter
        boolean hasUppercase = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
                break;
            }
        }
        if (!hasUppercase) {
            return false;
        }

        // Check if password contains at least one lowercase letter
        boolean hasLowercase = false;
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLowercase = true;
                break;
            }
        }
        if (!hasLowercase) {
            return false;
        }

        // Check if password contains at least one special character
        boolean hasSpecialChar = false;
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
                break;
            }
        }
        if (!hasSpecialChar) {
            return false;
        }

        // Check if password contains at least one digit
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {
            return false;
        }

        return true; // All requirements are met
    }


    public static Integer findMaxNum(int[] numbers) {
        // Check if array is null or empty
        if (numbers == null || numbers.length == 0) {
            return null; // Return null to indicate no maximum value
        }

        Integer max = null; // Initialize max as null

        // Iterate through each number in the array
        for (int number : numbers) {
            if (max == null || number > max) {// Check if max is null or current number is greater than max
                max = number; // Update max if a larger number is found
            }
        }

        return max; // Return the maximum number (or null if no numbers in the array)
    }

    public static int sumDigit(String str) {
        int sum = 0;

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char j = str.charAt(i);
            if (j >= '0' && j <= '9') {// Check if the character is a digit (between '0' and '9')
                sum += j - '0';// Convert the character to its numeric value and add it to the sum
            }
        }

        return sum;
    }

}











/*
String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space 2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false

----------------------------------------
Array -- Find Maximum
Write a method that can find the maximum number from an int Array

----------------------------------------
String -- sum of digits in a string
Write a method that can return the sum of the digits in a string

 */