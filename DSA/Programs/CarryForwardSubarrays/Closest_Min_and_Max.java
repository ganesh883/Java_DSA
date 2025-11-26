package CarryForwardSubarrays;

public class Closest_Min_and_Max {
    public static void main(String[] args) {
        int[] arr = {2,6,1,6,9};
        int n = arr.length;

        int maxindex = -1;
        int minindex = -1;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int ans = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }

        for(int i=0;i<n;i++){
            if(arr[i]==min){
                minindex=Math.max(i,minindex);
            }

            if(arr[i]==max){
                maxindex=Math.max(i,maxindex);
            }

            if(maxindex!=-1 && minindex !=-1){
                int range = Math.abs(maxindex-minindex)+1;
                ans = Math.min(range,ans);
            }

        }

        System.out.println(ans);
    }
}
