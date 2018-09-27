public class FindRepeatAndMissing {

    public static void findRepeatAndMissEle(int A[]){   //time: O(n), space: O(1)
        int i,xor=0,x=0;
        int x1=0,y1=0;
        for(i=0;i<A.length;i++){
            xor = xor^A[i];
            x= x^(i+1);
        }
        xor = xor^x;
        int set_bit_no= xor & ~(xor-1);

        for(i=0;i<A.length;i++){
            if((A[i]&set_bit_no)!=0)
                x1=x1^A[i];
            else
                y1=y1^A[i];
        }

        for(i=1;i<=A.length;i++){
            if((i&set_bit_no)!=0)
                x1=x1^i;
            else
                y1=y1^i;
        }

        System.out.println("Missing Ele : "+x1+"\n"+"Repeating Ele : "+y1);
    }
    public static void main(String[] args){
        int A[]={1,2,3,4,2};
        int B[] = new int [A.length+1];
        int missingEle=0;
        int repeatingEle=0;
        for(int i=0;i<A.length;i++){
            B[A[i]]++;
        }
        for(int i=1;i<B.length;i++){
            if(B[i]>1)
                repeatingEle=i;
            else
                if(B[i]==0)
                    missingEle=i;
        }
        System.out.println("Missing Ele : "+missingEle+"\n"+"Repeating Ele : "+repeatingEle);
        findRepeatAndMissEle(A);
    }
}
