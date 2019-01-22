import java.util.ArrayList;
import java.util.Arrays;

public class Flip {
    public static void main(String args []){
        //ArrayList<Integer> A= new ArrayList<>(Arrays.asList(1,1,1));
        String str = "01010110";
//        String str = "000101";
        char [] A =  str.toCharArray();
        int i,k;
        int stIndex=0;
        int fstIndex=Integer.MIN_VALUE;
        int endIndex=Integer.MIN_VALUE;
        boolean insideloop=false;
        int no_of_flip=0;
        int newflip=Integer.MIN_VALUE;
        for(i=0;i<A.length;i++) {
            k=i;
            while(k<A.length && A[k]=='0') {
                if(!insideloop)
                    stIndex=i;
                no_of_flip++;
                k++;
                insideloop=true;
            }

            if(insideloop) {
                i=k--;
                insideloop=false;
            }

            if(no_of_flip>newflip) {
                newflip = no_of_flip;
                no_of_flip=0;
                fstIndex=stIndex;
                endIndex=k;
            }else{
                if(no_of_flip==newflip){
                    if(!(fstIndex < stIndex || (fstIndex==stIndex && endIndex < k))){
                        fstIndex=stIndex;
                        endIndex=k;
                    }
                }
            }
        }

        System.out.println("consecutive zero flip to maximize the ones: "+newflip);
        System.out.println("StartIndex : "+fstIndex+" EndIndex: "+endIndex);
    }
}
