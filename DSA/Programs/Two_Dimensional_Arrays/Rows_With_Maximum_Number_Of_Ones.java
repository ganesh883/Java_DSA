package Two_Dimensional_Arrays;

public class Rows_With_Maximum_Number_Of_Ones {
    public static void main(String[] args) {
        int[][] arr = {{1,0,1},{1,1,1},{1,0,0}};

        int n = arr.length;
        int m = arr[0].length;

        int i = 0;
        int j = m-1;
        int ans = 0;

        while(j>=0 && i<n){
            if(arr[i][j]==1){
                j--;
                ans = i;
            }
            else{
                i++;
            }
        }
        System.out.println(ans);
    }
}
