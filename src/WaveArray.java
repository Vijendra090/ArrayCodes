import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WaveArray {

    public static void waveArray2(ArrayList<Integer> A){    //O(n)
        System.out.println("input arrayList : "+A);

        Integer temp;
        for(int i=0;i<A.size();i=i+2){
            if(i<A.size()-1 && (A.get(i) <= A.get(i+1))){
                temp =  A.get(i);
                A.set(i,A.get(i+1));
                A.set(i+1,temp);
            }
        }
        System.out.println("wave array : "+A);
    }

    public static void waveArray1(ArrayList<Integer> A){    //O(nlogn)
        //If there are multiple answers possible, return the one that's lexicographically smallest
        System.out.println("input arrayList : "+A);
        Collections.sort(A);    //way to sort a Integer collection
        System.out.println("sorted arrayList : "+A);
        Integer temp;
        for(int i=0;i<A.size();i=i+2){
            if(i<A.size()-1 && (A.get(i) <= A.get(i+1))){   //condition handles the base cases
                temp =  A.get(i);
                A.set(i,A.get(i+1));
                A.set(i+1,temp);
            }
        }
        System.out.println("wave array : "+A);
    }
    public static void main(String[] args){
//        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(10,5,6,3,2,20,100,80));
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        waveArray1(al);
        System.out.println("----------------------");
        waveArray2(al);
    }
}
