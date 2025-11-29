public class Solution {
    public int solve(int[] A, int B) {
        int n = A.length;
        int sum=0;
        int min_sum=0;

        for(int i=0;i<B;i++){
            sum+=A[i];
        }

        min_sum=sum;
        int index=0;

        int s = 1;
        int e = B;

        while(e<n){
            sum=sum-A[s-1]+A[e];
            if(sum<min_sum){
                min_sum=sum;
                index=s;
            }
            s++;
            e++;
        }

        return index;
    }
}