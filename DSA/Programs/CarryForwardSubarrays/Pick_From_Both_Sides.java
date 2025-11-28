package CarryForwardSubarrays;

public class Pick_From_Both_Sides {
    public static void main(String[] args) {

        int[] arr = {5, -2, 3 , 1, 2};
        int n = arr.length;

        int B = 3;

        int sum =0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<B;i++){
            sum+=arr[i];
        }

        max=sum;

        int start = B-1;
        int end = arr.length-1;

        while(start>0) {
            sum = sum - arr[start] + arr[end];
            max = Math.max(sum, max);
            start--;
            end--;
        }

        System.out.print(max);
    }

}
