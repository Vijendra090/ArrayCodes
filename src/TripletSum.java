import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class TripletSum {

    public static int findTriplet(ArrayList<String> a){
        int i;
        BigDecimal sum= BigDecimal.ZERO;
        int count=0;
        for(i=0;i<a.size();i++){
            BigDecimal x = new BigDecimal(a.get(i));
            if((sum.add(x)).compareTo(new BigDecimal(2))==-1){
                sum=sum.add(x);
                count++;
            }else{
                if(sum.compareTo(x)==1)
                    sum=x;
            }
            if(count ==3){
                if(sum.compareTo(new BigDecimal(1))==1){
                    System.out.println("Sum : "+sum);
                    return 1;
                }
                count--;
            }
        }
        return 0;
    }
    public static void main(String args[]){
        ArrayList<String> arr= new ArrayList<String>(Arrays.asList("1.660952", "2.201339", "2.244956", "2.312240", "0.453388", "0.759609", "0.348647", "1.877379"));

        int res=findTriplet(arr);
        if(res==1){
            System.out.println("Triplet found");
        }else{
            System.out.println("Triplet not found");
        }
    }
}
