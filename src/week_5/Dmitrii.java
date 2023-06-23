package week_5;

public class Dmitrii {

    public static void main(String[] args) {

        System.out.println("FindUnique(\"AAABBBCCCDEF\") = " + FindUnique("AAABBBCCCDEF"));

        System.out.println("Reverse(\"Dmitrii\") = " + Reverse("Dmitrii"));

    }

    public static String FindUnique(String str){
         /*String -- Find the unique
    Write a return method that can find the unique characters from the String
    Ex: unique("AAABBBCCCDEF") ==> "DEF";
    String -- Reverse*/
        String res="";
        for (int i = 0; i < str.length(); i++) {
            int count=0;
            char ch=str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (ch==str.charAt(j)){
                    count++;
                }
            }
            if (count==1){
                res+=ch+"";
            }

        }
        return res;
    }
    public static String Reverse(String str){
        /*Write a return method that can reverse String
    Ex: Reverse("ABCD"); ==> DCBA*/
        String res="";

        for (int i = str.length()-1; i >= 0; i--) {
            res+=str.charAt(i);
        }

        return res;
    }

}
