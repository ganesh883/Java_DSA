package Sliding_Window_Contribution_Technique;

public class Minimum_Swaps {
    public static void main(String[] args) {

        int[] arr = {1, 12, 10, 3, 14, 10, 5};
        int n = arr.length;
        int K =8;
        int count=0;

        for(int i=0;i<n;i++){
            if(arr[i]<K){
                count++;
            }
        }

        int s=0;
        int e=count;
        int value=0;
        int ans =Integer.MAX_VALUE;

        for(int i=s;i<e;i++){
            if(arr[i]>K){
                value++;
            }
        }

        while(e<n){
            if(arr[s]>K){
                value++;
            }
            else if(arr[e]>K){
                value--;
            }
            s++;
            e++;
            ans = Math.min(value,ans);
        }
        System.out.println(ans);

    }
}
