package Week_8;

import java.util.Arrays;
import java.util.Arrays;

public class Nina {

    //Array-move zero to the end
    public static int[] arrayMoveZerosToEnd(int[] arr){
        int[] result = new int[arr.length-1];

        for (int i = 0, j=0; i < arr.length; i++) {
            if (arr[i]!=0){
                result[j++]=arr[i];
            }
        }

        return result;
    }

    }




