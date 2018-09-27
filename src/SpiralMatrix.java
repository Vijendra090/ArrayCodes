import java.util.ArrayList;

public class SpiralMatrix {

    public static ArrayList<ArrayList<Integer>> spiralMatrix(int n){
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        Integer [][] temp = new Integer[n][n];
        int nsquare=n*n;
        int k=1,i;
        int top=0,bottom=n-1,left=0,right=n-1;
        while(k<nsquare) {
            for (i = left; i <= right; i++)
                temp[top][i] = k++;
            top++;
            for (i = top; i <= bottom; i++)
                temp[i][right] = k++;
            right--;
            for (i = right; i >= left; i--)
                temp[bottom][i] = k++;
            bottom--;
            for (i = bottom; i >= top; i--)
                temp[i][left] = k++;
            left++;
        }
        ArrayList<Integer> al =new ArrayList<>();
        ArrayList<Integer> al1;
        for(i=0;i<n;i++){
            for(k=0;k<n;k++){
                al.add(temp[i][k]);
            }
            al1=(ArrayList<Integer>)al.clone();
            res.add(al1);
            al.clear();
        }
        return res;
    }
    public static void main(String args[]){
        int n=4;
        ArrayList<ArrayList<Integer>> result=spiralMatrix(n);
        System.out.println(result);
    }
}
