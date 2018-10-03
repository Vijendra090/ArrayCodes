import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LargestNumber {

    public static void largestNumber(ArrayList<Integer> al){
        ArrayList<String> B = new ArrayList<>();
        for(Integer ele : al){
            B.add(ele.toString());
        }

        Collections.sort(B, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String aa = a+b;
                String bb = b+a;
                return aa.compareTo(bb);
            }
        });

        /*for (String ele: B){
            System.out.print(ele+" ");
        }*/

        StringBuilder ans = new StringBuilder();
        int result = 0;
        for (int i = B.size() - 1; i >= 0; i--) {
            ans.append(B.get(i));
            result += Integer.parseInt(B.get(i));
        }
        String res = result==0 ? "0" : ans.toString();
        System.out.println("Largest Number : "+res);
    }

    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3,30,34,5,9));
        largestNumber(arr);
    }
}
