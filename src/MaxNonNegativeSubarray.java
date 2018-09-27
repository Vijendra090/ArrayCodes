import java.util.ArrayList;
import java.util.Arrays;

public class MaxNonNegativeSubarray {

    public static ArrayList<Integer> maxNonNegativeSubarray(ArrayList<Integer> al) {
        long maxSum = 0;
        long newSum = 0;
        ArrayList<Integer> maxArray = new ArrayList<Integer>();
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (Integer i : al) {
            if (i >= 0) {
                newSum += i;
                newArray.add(i);
            } else {
                newSum = 0;
                newArray = new ArrayList<Integer>();
            }
            if ((maxSum < newSum) || ((maxSum == newSum) && (newArray.size() > maxArray.size()))) {
                maxSum = newSum;
                maxArray = newArray;
            }
        }
        return maxArray;
    }

    public static void main(String args[]){
        ArrayList<Integer> al= new ArrayList<>(Arrays.asList(-846930886, -1714636915, 424238335, -1649760492));
        ArrayList<Integer> result = maxNonNegativeSubarray(al);
        System.out.print(result);
    }
}
