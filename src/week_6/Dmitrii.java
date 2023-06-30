package week_6;

public class Dmitrii {

    public static void main(String[] args) {

        System.out.println("========================= TASK # 1 ================================");
        System.out.println("Password_Validation(\"Abcd123!\") = " + Password_Validation("Abcd123!"));
        System.out.println("Password_Validation(\"Ab23!\") = " + Password_Validation("Ab23!"));
        System.out.println("Password_Validation(\"Ab23 21!\") = " + Password_Validation("Ab23 21!"));
        System.out.println("Password_Validation(\"abcd123!\") = " + Password_Validation("abcd123!"));
        System.out.println("Password_Validation(\"Abcd123\") = " + Password_Validation("Abcd123"));
        System.out.println("Password_Validation(\"ABCD123!\") = " + Password_Validation("ABCD123!"));

        System.out.println("========================= TASK # 2 ================================");
        int[] arr={2,-5,19,100,18, 4,0, -1};
        System.out.println("ArrayMaximum(arr) = " + ArrayMaximum(arr));

        System.out.println("========================= TASK # 3 ================================");

        System.out.println("SumDigitOfString(\"avcc!1345\") = " + SumDigitOfString("avcc!1345"));


    }

    public static boolean Password_Validation(String password) {
    /*
    String -- Password Validation Task
    1. Write a return method that can verify if a password is valid or not.
    requirements:
    1. Password MUST be at least have 6 characters and should not contain space
    2. PassWord should at least contain one upper case letter
    3. PassWord should at least contain one lowercase letter
    4. Password should at least contain one special characters
    5. Password should at least contain a digit
    if all requirements above are met, the method returns true, otherwise returns false
     */

        if (password.length() < 6 || (password.contains(" "))) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char eachChar : password.toCharArray()) {   // iterate every character of given password
            if (Character.isUpperCase(eachChar)) {   // check Password contain upper case letter
                hasUppercase = true;
            } else if (Character.isLowerCase(eachChar)) { // check Password contain lower case letter
                hasLowercase = true;
            } else if (Character.isDigit(eachChar)) { // check Password contain digit
                hasDigit = true;
            } else if (!(Character.isLetterOrDigit(eachChar)) ) {   // if character is not a Letter Or Digit that mean it special characters
                hasSpecialChar = true;
            }

        }

        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }

    public static int ArrayMaximum(int[] arr) {
//        Array -- Find Maximum
//        Write a method that can find the maximum number from an int Array
        int res=Integer.MIN_VALUE; // assign minimum possible int
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > res){
                res=arr[i];
            }
        }
        return res;
    }

    public static int SumDigitOfString (String str){
//        String -- sum of digits in a string
//        Write a method that can return the sum of the digits in a string
        int res=0;

        for (char eachChar : str.toCharArray()) {
             if (Character.isDigit(eachChar)){
                 res+=Integer.parseInt(eachChar+"");  // convert String to Integer
             }
        }

        return res;
    }


}