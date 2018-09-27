import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSumSubArray {

    public static void FindingMaxSumSubarray(ArrayList<Integer> arr){
        int maxSum=0;
        int nextSum=0;
        int startIndex=0;
        int endIndex=0;
        int i,j;
        System.out.println("Input array : "+arr);
        for(i=0;i<arr.size();i++){
            for(j=i;j<arr.size();j++){
                nextSum+=arr.get(j);
                if(nextSum>maxSum){
                    maxSum=nextSum;
                    startIndex=i;
                    endIndex=j;
                }
            }
            nextSum=0;
        }
        System.out.println("Max Sum of contigious subarray : "+ maxSum);
        List<Integer> subArray = arr.subList(startIndex,endIndex+1);
        System.out.println("StartIndex : "+startIndex+"  "+"EndIndex : "+endIndex);
        System.out.println("Subarray : "+subArray);
    }
    public static void main(String args[]){

        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(-2, -3, 4, -1, -2, 1, 5, -3));
        FindingMaxSumSubarray(arr);
    }
}
