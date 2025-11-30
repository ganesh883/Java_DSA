package Two_Dimensional_Arrays;

public class Spiral_Order_Matrix {
    public static void main(String[] args) {

        int n = 5;
        int m = 5;

        int[][] ans = new int[n][n];
        int val = n*n;
        int value =1;

        int left  = 0;
        int right = m-1;
        int top=0;
        int bottom = n-1;

        //left -> right
        //top -> bottom
        //right -> left
        //bottom -> top

        while(left<=right && top<=bottom){

            for(int i=left;i<=right;i++){
                ans[top][i] = value++;
                val++;
            }
            top++;

            for(int i=top;i<=bottom;i++){
                ans[i][right]=value++;
                val++;
            }
            right--;

            // right -> left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans[bottom][i] = value++;
                }
                bottom--;
            }

            // bottom -> top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans[i][left] = value++;
                }
                left++;
            }
        }

        // Print matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }
}
