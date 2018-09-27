import java.util.ArrayList;

public class Test {
    public static int findTriplet(Double[] a){
        int i;
        double sum=0;
        int count=0;
        for(i=0;i<a.length;i++){

            if((sum+a[i])<2){
                sum+=a[i];
                count++;
            }
            if(count ==3 && sum>1) {
                System.out.println("Sum : "+sum);
                return 1;
            }
        }
        return 0;
    }
    public static void main(String args[]){
        Double [] arr = {0.6, 0.7, 0.8, 1.2, 0.4};

        int res=findTriplet(arr);
        if(res==1){
            System.out.println("Triplet found");
        }else{
            System.out.println("Triplet not found");
        }
    }
}
