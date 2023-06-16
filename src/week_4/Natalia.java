package week_4;

public class Natalia {






    //1. String - Frequency of Characters
    //Write a return method that can find the frequency of chars
    //ex: frequesncyOfChars("AAABBCDD") ==> A3B2C1D2
    public static String frequencyOfChars(String stringOfChars){

        String result = "";



        for (int j = 0; j < stringOfChars.length(); j++) {

            char ch = stringOfChars.charAt(j);
            int count = 0;

            for (int i = 0; i < stringOfChars.length(); i++) {

                if (stringOfChars.charAt(i) == ch){
                    count++;
                }
            }

            if (result.contains("" + ch)){
                continue;
            }

            result += ch + "" + count;
        }

        return result;
    }



    //2.String - Same Letters
    //Write a return method that can check if a string is build out of
    // teh same letters as another string.
    //ex: same("abc", "cab"); ==> true
    //    same("abc", "abb"); ==> false




    //3.String - Remove dublicates
    //Write a return method that can remove the dublicated valuesfrom String
    //ex: removeDub("AAABBBBCC"); ==> ABC



}
