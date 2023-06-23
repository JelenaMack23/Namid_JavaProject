package week_5;

public class Nina {

    public static void main(String[] args) {

        System.out.println("Reverse name is = " + Reverse("Giraffe"));
        System.out.println("Unique String = " + unique("ssghahahsvgsgsgsgshsshshshshshzy"));

    }

    //Task #1 String -Find Unique
    //Write return method that can find the unique characters from String
    //Ex:Unique(AAABBBCCCDEF)==>"DEF";

    public static String unique(String str) {

    String result="";

    for(int i =0 ; i < str.length(); i ++){
        int number = 0;
        char ch=str.charAt(i);

    for (int j = 0; j < str.length(); j++) {
        if (ch == str.charAt(j)){
            number++;
        }
    }
    if(number==1){
        result = result + ch +"";
      }
    }
    return result;
    }

    //Task#2 String Reverse
    //Write return method that can reverse String
    //Ex:Reverse("ABCD") ==>DCBA

    public static String Reverse(String name){ //giraffe
        String result= ""; // e,f,f,a,r,i,g
        for(int i = name.length()-1; i>=0; i--){
            result = result + name.charAt(i);
        }
        return result;

    }

  }
