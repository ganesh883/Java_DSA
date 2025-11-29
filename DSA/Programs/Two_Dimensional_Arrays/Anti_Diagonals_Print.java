package Two_Dimensional_Arrays;

public class Anti_Diagonals_Print {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int n = arr.length;
        int m = arr[0].length;

        int[][] ans = new int[2*n-1][n];
        int row=0;
        int col=0;

        int i=0;

        for(int j=0;j<n;j++){
            int s=i;
            int e=j;
            col=0;
            while(s<n && e>=0){
                ans[row][col] = arr[s][e];
                s++;
                e--;
                col++;
            }
            row++;
        }

        int k = n-1;

        for(int j=1;j<n;j++){
            int s=j;
            int e=k;
            col=0;
            while(s<n && e>=0){
                ans[row][col] = arr[s][e];
                s++;
                e--;
                col++;
            }
            row++;
        }

        for(int ii=0;ii<ans.length;ii++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[ii][j]+" ");
            }
            System.out.println();
        }
    }
}
