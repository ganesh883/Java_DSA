package Arrays_1D_2D_Arrays_Easy;

public class Rotate_Array_K_Times {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = arr.length;

        int k = 2;

        //BruteForce
        // Left shift of an array for k times -> TC : O(n2)  SC : O(1)

        //Optimized
        // Reverse Entire Array -> Reverse the first K -> Reverse from K+1 to N -> TC: O(n) SC: O(1)

        if(k>n){
            k=k%n;
        }

        reverse(0,n-1,arr);
        reverse(0,k-1,arr);
        reverse(k,n-1,arr);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] reverse(int start, int end,int[] arr){
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        return arr;
    }
}
