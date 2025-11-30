package Interview_problem;

public class Sum_Of_All_Submatrices {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4}};
        int n = arr.length;
        int m = arr[0].length;

        int ans = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans += arr[i][j]*(i+1)*(j+1)*(n-i)*(m-j);
            }
        }
        System.out.println(ans);
    }
}
