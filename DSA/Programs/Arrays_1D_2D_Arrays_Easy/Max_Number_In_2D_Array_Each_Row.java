package Arrays_1D_2D_Arrays_Easy;

public class Max_Number_In_2D_Array_Each_Row {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int n = arr.length;
        int m = arr[0].length;

        int[] ans = new int[n];

        int max= Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            max=Integer.MIN_VALUE;
            for(int j=0;j<m;j++){
                if(arr[i][j]>=max){
                    max=arr[i][j];
                }
            }
            ans[i]=max;
        }


        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }

    }
}
