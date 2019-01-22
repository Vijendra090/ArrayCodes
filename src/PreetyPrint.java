public class PreetyPrint {

    public static void main(String[] args) {
        int A = 4, i;
        int n = A * 2 - 1;
        int left = 0, top = 0, right = n - 1, bottom = n - 1;
        Integer[][] a = new Integer[n][n];

        while (A > 0) {
            for(i = left; i<=right; i++)
                a[top][i] = A;
            top++;
            for(i=top;i<=bottom;i++)
                a[i][right]=A;
            right--;
            for(i=right;i>=left;i--)
                a[bottom][i]=A;
            bottom--;
            for(i=bottom;i>=top;i--)
                a[i][left]=A;
            left++;
            A--;
        }

        for(i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
