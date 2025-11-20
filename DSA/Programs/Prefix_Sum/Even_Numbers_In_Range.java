package Prefix_Sum;

public class Even_Numbers_In_Range {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int [][] range =    {{0,2},
                            {2,4},
                             {1,4}};
        int n = arr.length;

        int[] psum = new int[n];

        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                arr[i]=1;
            }
            else{
                arr[i]=0;
            }
        }

        psum[0]=arr[0];
        for(int i=1;i<n;i++){
            psum[i]=psum[i-1]+arr[i];
        }


        int[] ans = new int[range.length];

        for(int i=0;i<range.length;i++){
            int start = range[i][0];
            int end = range[i][1];

            if(start==0){
                psum[i]=0;
            }
            else{
                psum[i]=psum[end]-arr[start-1];
            }

            ans[i]=psum[i];

        }

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }




    }
}
