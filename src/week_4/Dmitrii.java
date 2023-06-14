package week_4;

public class Dmitrii {

  public static void main(String[]args) {

      System.out.println("------------------------TASK #1----------------------------------------------");
      System.out.println("FrequencyOfCharacters(\"AAABBCDD\") = " + FrequencyOfCharacters("AAABBCDD"));

      System.out.println("------------------------TASK #2----------------------------------------------");
      System.out.println("SameLetters(\"abcde\", \"cabed\"), expected true = " + SameLetters("abcde", "abcde"));
      System.out.println("SameLetters(\"abc\", \"aabed\"), expected false = " + SameLetters("abc", "aabed"));


      System.out.println("------------------------TASK #3----------------------------------------------");
      System.out.println("RemoveDuplicates(\"AAABBCDD\") = " + RemoveDuplicates("AAABBCDD"));
  }

  public static String FrequencyOfCharacters(String str){
   // Write a return method that can find the frequency of characters
   // "AAABBCDD" -> A3B2C1D2
   String res="";

   for (int i = 0; i < str.length()-1; i++) {
       int count=0; // counting duplicates, must be here to re-assign it on each iteration of first loop
    for (int j = 0; j < str.length()-1; j++) {
      if (str.charAt(i)==str.charAt(j)){
       count++;
      }
    }
    if (!(res.contains(str.charAt(i)+""))){  // check if result already NOT contains i element, in order to avoid duplicates
     res+=(str.charAt(i)+"")+count;
    }

   }

   return res;
  }

  public static boolean SameLetters(String str1, String str2){
   // write a return method  that check if a string is build out of the same letters as another string
   // ex: "abc", "cab"-> true;    "abc", "abb" -> false

      int count=0; // count how many element str2 contains str1
      for (int i = 0; i < str1.length(); i++) {
           if (str2.contains(str1.charAt(i)+"")){  // check if str2 contains i element str1 and opposite
           count++; // if contains inrease count
          }
      }
      if (count==str1.length()){  // if equal it means count increased every loop iteration, what means str2 contains from characters str1
          return true;
      } else return false;
  }
  public static String RemoveDuplicates(String str){
    // Write s return method that can remove the duplicated value from String
      // Ex: AAAAABBBBBCCCCDD --> ABCD
      String res="";

      for (int i = 0; i < str.length()-1; i++) {
          if (!(res.contains(str.charAt(i)+""))){  // check if result  NOT contains i element, in order to avoid duplicates
              res+=(str.charAt(i)+"");
          }
      }

      return res;
  }
}