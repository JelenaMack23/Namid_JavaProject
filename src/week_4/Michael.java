package week_4;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Michael {
    public static void main(String[] args) {

        frequencyOfCharacters("aaaAAAAAbCCCCdddMK");

        System.out.println("Do the words you provide have same letters? ==> " + sameLetters("ADLI", "LIDA"));
        System.out.println("Do the words you provide have same letters? ==> " + sameLetters("ADLE", "LIDA"));

        System.out.println("removeDup_1 = " + removeDup_1("aaaaaAAAAAbbbbddddddddddeMK"));
        System.out.println("removeDup_2 = " + removeDup_2("aaaaaAAAAAbbbbddddddddddeMK"));


    }

    public static void frequencyOfCharacters(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (Character each : str.toCharArray()) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }
        System.out.println(map);
    }

    public static boolean sameLetters(String a, String b) {
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a1 = "", a2 = "";
        for (char each : ch1)
            a1 += each;

        for (char each : ch2)
            a2 += each;

        return a1.equals(a2);
    }

    public static  String  removeDup_1( String  str) {
        String result = "";
        for (int i = 0; i < str.length(); i++)
            if (!result.contains("" + str.charAt(i)))
                result += "" + str.charAt(i);

        return result;
    }

    public static String removeDup_2(String str) {
        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
        str = str.replace(", " ,  "" ).replace("[","").replace("]","");
        return  str;
    }


}
