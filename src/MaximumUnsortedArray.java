import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/*Given: An array of non-negative integers need to find minimum length subarray , so that by sorting this subarray
* whole get sorted.
*/
public class MaximumUnsortedArray {

    public static ArrayList<Integer> findTheSubarray(ArrayList<Integer> al){

        if(al.isEmpty()){
            return new ArrayList<Integer>(Arrays.asList(-1));
        }
        ArrayList<Integer> subarray = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        Integer startIndex=-1,endIndex=-1;
        int i,topElement,fStIndex=Integer.MAX_VALUE;
        stack.push(al.get(0));

        for(i=1;i<al.size();i++){
            topElement = stack.peek();
            if(al.get(i)>=topElement){
                stack.push(al.get(i));
            }else{
                endIndex=i;
                if(startIndex==-1) {
                    Integer top = (stack.size() - stack.search(topElement));
                    //System.out.println("top : "+top);
                    while (top>-1 && al.get(i) <stack.elementAt(top)) {
                        top--;
                    }
                    startIndex = top + 1;
                }
                if(fStIndex>startIndex)
                    fStIndex=startIndex;
                startIndex=-1;
            }
        }
        if(startIndex==endIndex){
            subarray.add(-1);
        }else {
            subarray.add(fStIndex);
            subarray.add(endIndex);
        }
        return  subarray;
    }

    public static void main(String [] args){
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 1, 10, 10, 15, 10, 15, 10, 10, 15, 10, 15));
//        List<Integer> al = new ArrayList<>(Arrays.asList(10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60));
//        List<Integer> al = new ArrayList<>(Arrays.asList(16, 6, 18, 17, 13, 6, 18, 16, 6, 15, 15, 18, 16, 13, 16, 16, 6, 18, 15, 15));
        ArrayList<Integer> subarray = findTheSubarray(al);
        System.out.print(subarray);
    }
}
