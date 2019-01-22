/*multiple repeated element is possible.
* given n+1 integer array in range 1 to n
*/
public class FindDublicate {

    public static void main(String[] args){

        Integer[] a = {1,2,3,4,1};

        int [] b= new int[a.length];
        int repeat=0,i;
        /*for(i=0;i<a.length;i++)
            System.out.print(b[i]);*/
        for(i=0;i<a.length;i++){

            b[a[i]]++;
            if(b[a[i]]>1) {
                repeat=1;
                break;
            }
        }

        if(repeat==1)
            System.out.print("repeated ele is : " + a[i]);
        else
            System.out.print("no repeated element" );

    }
}
