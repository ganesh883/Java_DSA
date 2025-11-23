package Prefix_Sum;

public class Range_Sum_Query {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int[][] B = {{0,3}, {1,2}};

        int n = arr.length;

        int[] psum = new int [n];
        psum[0]=arr[0];

        for(int i=1;i<n;i++){
            psum[i]=psum[i-1]+arr[i];
        }

        int[] ans = new int[B.length];

        for(int i=0;i<B.length;i++){
            int start = B[i][0];
            int end = B[i][1];

            if(start==0){
                ans[i]=psum[end];
            }
            else {
                ans[i] = psum[end] - psum[start - 1];
            }
        }

        for(int i=0;i< ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
