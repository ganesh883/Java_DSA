package CarryForwardSubarrays;

public class Possible_Subarrays_With_Sum_Less_Than_B {
    public static void main(String[] args) {
        int[] arr = {2,5,6};
        int B = 10;

        int count =0;
        int ans=0;

        for(int i=0;i<arr.length;i++){
            count=0;
            for(int j=i;j<arr.length;j++){
                count+=arr[j];
                if(count<B){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
