package week_6;

public class Piri6 {
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






