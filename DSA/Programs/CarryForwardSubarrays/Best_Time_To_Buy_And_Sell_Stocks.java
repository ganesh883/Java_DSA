package CarryForwardSubarrays;

public class Best_Time_To_Buy_And_Sell_Stocks {
    public static void main(String[] args) {
        int[] arr = {1,4,5,2,4};
        int n = arr.length;

            int min = Integer.MAX_VALUE;
            int profit = Integer.MIN_VALUE;

            for(int i=0;i<n;i++){
                min= Math.min(min,arr[i]);
                profit=Math.max(profit,arr[i]-min);
            }

        System.out.println(profit);
    }
}
