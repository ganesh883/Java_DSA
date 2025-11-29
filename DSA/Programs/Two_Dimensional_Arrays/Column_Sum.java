package Two_Dimensional_Arrays;

public class Column_Sum {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int n = arr.length;
        int m = arr[0].length;

        int sum=0;

        for(int i=0;i<m;i++){
            sum=0;
            for(int j=0;j<n;j++){
                sum+=arr[j][i];
            }
            System.out.print(sum);
            System.out.println();
        }

    }
}
