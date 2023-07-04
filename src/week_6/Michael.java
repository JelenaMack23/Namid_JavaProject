package week_6;

public class Michael {
    public static void main(String[] args) {
        passWordvalidation("Meissa29!*");

        int [] nums= {1, 5, 25, 152, 125, 365};
        maxValue_1(nums);

        sumOfDigits("dsmaş496svd449464");

    }

    public static boolean passWordvalidation(String password) {
        String lowercase="(.*[a-z].*)";
        String uppercase="(.*[A-Z].*)";
        String numbers="(.*[0-9].*)";
        String specialchars="(.*[ -/, :-@].*)";

        boolean  HasLower = password.matches(lowercase),
                HasUpper = password.matches(uppercase),
                HasDigits = password.matches(numbers),
                HasSpecial = password.matches(specialchars),
                valid = false;

        if(password.length() >= 6 && !password.contains(" "))
            if( HasLower && HasUpper && HasDigits && HasSpecial)
                valid = true;
        System.out.println("Result = " + valid);
        return valid;
    }

    public static int maxValue_1( int[]  n ) {
        int max = Integer.MIN_VALUE;
        for(int each: n)
            if(each > max)
                max = each;

        System.out.println("max = " + max);

        return max;
    }

    public  static int  sumOfDigits(String s) {
        int total = 0;
        char[] ch =  s.toCharArray();
        for(char each: ch) {
            if(Character.isDigit(each)) {
                total += Integer.valueOf(""+each);
            }
        }
        System.out.println("total = " + total);
        return total;
    }



}
