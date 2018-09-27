import java.util.ArrayList;
import java.util.Arrays;

public class Flip {
    public static void main(String args []){
        ArrayList<Integer> A= new ArrayList<>(Arrays.asList(0,1,0,0,1,1,0));
        int i,j, num_of_zero=0,temp=0;
        int isfirst=1;
        for(j=0;j<A.size();j++) {
            for (i = 0; i < A.size(); i++) {
                if (A.get(i) == 0)
                    temp++;
                else {
                    while (isfirst == 1 && A.get(i) == 1) {
                        temp++;
                        i++;
                    }
                    isfirst = 0;
                    j=i;
                }
            }
            if (temp > num_of_zero) {
                num_of_zero = temp;
                temp=0;
            }
            isfirst=1;
        }
        System.out.println("Number of zero after one flip : "+num_of_zero);
    }
}
