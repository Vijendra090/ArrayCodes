import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaximumConsecutiveGap {
    public static void main(String[] args){
        final ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,10,5));
        al.set(1,3);
        System.out.println("List before sorting : "+al);
        Collections.sort(al);

        System.out.println("List after sorting : "+al);

        int i;
        int diff;
        int maxDiff=Integer.MIN_VALUE;
        if(al.size()<2)
            System.out.print("Not possible to find");
        else{
            for(i=0;i< al.size();i++){
                if(i+1 < al.size()){
                    diff = al.get(i+1) - al.get(i);
                    if(diff>maxDiff)
                        maxDiff=diff;
                }
            }
            System.out.print("Maximum consecutive gab is : "+maxDiff);
        }
    }
}
