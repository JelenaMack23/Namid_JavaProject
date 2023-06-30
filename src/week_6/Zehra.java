package week_6;

public class Zehra {



        public static void main(String[] args) {

// First task
            String p="Sweret23!";
            System.out.println(isValidPassword(p));

            System.out.println("------------");
            //second task
            int[] arr = {99, 12, 23, 32, 44, 57, 6};// ==> 99
            System.out.println("maxNum(arr) = " + maxNum(arr));



            System.out.println("---------------------------");
            //third task
            String input = "zehrasener55";
            int digitSum = sumDigit(input);
            System.out.println("Sum of digits: " + digitSum);




        }

        public static boolean isValidPassword(String password){
            boolean r1 = password.length() >= 6 && !password.contains(" ");
            boolean r2 = false;  // has Upper case letter
            boolean r3 = false;  // has lower case letter
            boolean r4 = false;  // has Digit
            boolean r5 = false; // has Special Character

            for (char each : password.toCharArray()) {

                if(Character.isUpperCase(each)){
                    r2 = true;
                }else if(Character.isLowerCase(each)){
                    r3 = true;
                }else if(Character.isDigit(each)){
                    r4 = true;
                }else{
                    r5 = true;
                }

            }

            return  r1 && r2 && r3 && r4 && r5;
        }


/*
1. Write a return method that can verify if a password is valid or not.
-Requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper-case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special character
5. Password should at least contain a digit
-if all requirements above are met, the method returns true, otherwise returns  false

 */






        public static int maxNum(int [] arr){
            int max=arr[0];

            for(int i=0; i<arr.length; i++){
                if ( arr[i] > max){
                    max=arr[i];
                }
            }
            return max;
        }



        /*
        Write a method that can find the maximum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
         */


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
