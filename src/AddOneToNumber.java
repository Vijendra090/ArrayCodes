
import java.util.ArrayList;
import java.util.Arrays;

public class AddOneToNumber {
    public static void main(String args[]){
        ArrayList<Integer> arr =  new ArrayList<Integer>(Arrays.asList(0,0,0,4,5,9));
        ArrayList<Integer> b = new ArrayList<Integer>();

        int i;
        int len=arr.size();
        System.out.println("Input: "+arr);

        for(i=len-1;i>=0;i--){
            if((arr.get(i)+1)%10 == 0){
                arr.set(i,0);
                continue;
            }
            arr.set(i,arr.get(i)+1);
            break;
        }

        if(i==-1){
            for(i=0;i<len;i++){
                if(i==0)
                    b.add(1);
                b.add(0);
            }
        }
        else{
            i=0;
            while(i<len && arr.get(i)==0)
                i++;
            while(i<len)
                b.add(arr.get(i++));
        }
        System.out.println("Output: "+b);
    }
}
