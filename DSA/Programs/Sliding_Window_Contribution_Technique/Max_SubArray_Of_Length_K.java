package Sliding_Window_Contribution_Technique;

public class Max_SubArray_Of_Length_K {
    public static void main(String[] args) {

        int[] arr = {2,3,9,-1,7,1,0};
        int n = arr.length;

        int k = 4;


         //BruteForce -> O(n2) SC O(1)
        int ss=0;
        int end=k-1;
        int total=0;

        int max1=0;

        while(end<n-1){
            total=0;

            for(int i=ss;i<=end;i++){
                total+=arr[i];
            }
            ss++;
            end++;
          max1=Math.max(total,max1);
        }

        System.out.println(max1);


        //Sliding window TC O(n) SC O(1)

        int sum =0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }

        int max = sum;

        int s=1;
        int e=k;

        while(e<n){
            sum=sum-arr[s-1]+arr[e];
            max=Math.max(sum,max);
            s++;
            e++;
        }
        System.out.println(max);
    }
}
