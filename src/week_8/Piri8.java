package week_8;

public class Piri8 {

    public static boolean validatePassword(String password) {
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                hasSpecialChar = true;
            }
        }

        return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;
    }

    public static int findMaxNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty or null.");
        }

        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    }

    public static int calculateDigitSum(String str) {
        int sum = 0;

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                sum += digit;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        // Test password validation
        String password = "Password123!";
        boolean isValid = validatePassword(password);
        System.out.println("Password is valid: " + isValid);

        // Test finding the maximum number in an array
        int[] nums = { 10, 5, 8, 20, 3 };
        int maxNumber = findMaxNumber(nums);
        System.out.println("Maximum number: " + maxNumber);

        // Test calculating the sum of digits in a string
        String input = "abc123xyz";
        int digitSum = calculateDigitSum(input);
        System.out.println("Sum of digits: " + digitSum);
    }
}

/*
First, we have the generateArrayWithZeroSum method. This method takes an integer N as input and generates an array of size N with unique integers that sum up to 0. Here's how it works:

We perform some input validation to ensure that N is within the valid range of 2 to 100.
We create an empty array of size N to store the generated integers.
We initialize a variable sum to keep track of the sum of the generated integers.
We use a Random object to generate N-1 random integers between -100 and 99. These integers are added to the array, and their sum is accumulated in the sum variable.
Finally, we calculate the value of the last element in the array to make the sum of all elements equal to 0. This is done by assigning -sum to array[N-1].
The method then returns the generated array.
Next, we have the moveZerosToEnd method. This method takes an array as input and moves all the zeros to the end of the array without using the sort method. Here's how it works:

We initialize a variable count to keep track of the number of non-zero elements encountered.
We iterate over the array using a for loop. For each element, if it is non-zero, we move it to the front of the array by assigning it to array[count] and incrementing count.
After traversing the entire array, we have moved all the non-zero elements to the front, and count represents the number of non-zero elements.
We then fill the remaining elements from count to the end of the array with zeros.
At this point, all the zeros have been moved to the end of the array.
In the main method, we demonstrate the usage of both methods:

First, we generate an array with N unique integers that sum up to 0. We set N to 4 and call the generateArrayWithZeroSum method, storing the result in the result array. We then print the generated array.
Next, we have an array array with some elements, including zeros. We call the moveZerosToEnd method, passing array as an argument. This modifies the array in-place, moving the zeros to the end. We then print the modified array.
By combining both methods and running the program, you can see the result of generating an array with unique integers summing up to 0 and moving zeros to the end of another array
 */


