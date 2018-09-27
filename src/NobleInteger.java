import java.util.Arrays;
import java.util.Collections;

public class NobleInteger {

    public static int containNobleInteger(Integer[] arr){
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            if(arr[i] == arr.length-i-1)
                return 1;
        }
        return -1;

    }

    public static void main( String args[]){
        Integer arr[] = {-1, -9, -2, -78, 0};
        int res = containNobleInteger(arr);
        if(res == 1)
            System.out.println("yes");
        else
            System.out.println("no");

    }
}
