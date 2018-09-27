import java.util.ArrayList;
import java.util.Arrays;

public class MaxAbsoluteDiff {
    public static int f(int Ai,int Aj,int i,int j){
        return (Math.abs(Ai-Aj)+ Math.abs(i-j));
    }
    public static void maxAbsolutediff(ArrayList<Integer> A){   // takes O(n) time
        int max1,min1,max2,min2,i;
        max1=Integer.MIN_VALUE;
        min1=Integer.MAX_VALUE;
        max2=Integer.MIN_VALUE;
        min2=Integer.MAX_VALUE;

        for(i=0;i<A.size();i++){
            max1=Math.max(max1,A.get(i)+i);
            min1=Math.min(min1,A.get(i)+i);
            max2=Math.max(max2,A.get(i)-i);
            min2=Math.min(min2,A.get(i)-i);
        }
        int ans = Math.max((max1-min1),(max2-min2));
        System.out.println("Answer : "+ans);
    }
    public static void main(String[] args){
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3, -2, 5, -4));
        System.out.println("Input Array : "+A);
        int i,j,temp;
        int max=Integer.MIN_VALUE;
        for(i=0;i<A.size();i++) {
            for(j=i+1;j<A.size();j++) {
                temp=f(A.get(i),A.get(j),i,j);
                if(temp>max)
                    max=temp;
            }
        }
        System.out.println("Max Difference is : "+ max);
        maxAbsolutediff(A);
    }
}