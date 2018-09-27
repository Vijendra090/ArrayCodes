import java.util.ArrayList;
import java.util.Arrays;

public class PrintAntiDiagonalMatrix {

    public static ArrayList<ArrayList<Integer>> antiDiagonal(ArrayList<ArrayList<Integer>> a){
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> temp;
        int row_length = a.get(0).size();
        int loop= 2*row_length - 1;

        int i=0,j=0;
        int p,q;
        while(loop-- >0) {
            if (j < row_length) {
                p = i;
                q = j;
                while (p <= j) {
                    al.add(a.get(p).get(q));
                    p++;
                    q--;
                }
                j++;
            } else {
                p = ++i;
                q = j - 1;
                while (p < j) {
                    al.add(a.get(p).get(q));
                    p++;
                    q--;
                }
            }
            temp=(ArrayList<Integer>) al.clone();
            res.add(temp);
            al.clear();
        }
        return res;
    }

    public static void main(String args[]){

        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        al.add(new ArrayList<>(Arrays.asList(1,2,3)));
        al.add(new ArrayList<>(Arrays.asList(4,5,6)));
        al.add(new ArrayList<>(Arrays.asList(7,8,9)));
        System.out.println(al);

        ArrayList<ArrayList<Integer>> res = antiDiagonal(al);
        System.out.println(res);
    }
}
