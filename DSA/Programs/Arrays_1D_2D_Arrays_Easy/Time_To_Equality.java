package Arrays_1D_2D_Arrays_Easy;

public class Time_To_Equality {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,2};
        int n = arr.length;

        int count =0;
        int max = Integer.MIN_VALUE;


//    Bruteforce approach
//        for(int i=0;i<n;i++){
//            max=Math.max(arr[i],max);
//        }
//
//        for(int i=0;i<n;i++){
//            while(arr[i]<max){
//                count++;
//                arr[i]++;
//            }
//        }
//
//        System.out.println(count);
//
//        //TC -> O(n2) SC -> O(1)

        // Optimized


                for(int i=0;i<n;i++){
            max=Math.max(arr[i],max);
        }

        for(int i=0;i<n;i++){
           count+=max-arr[i];
        }

        System.out.println(count);

        //TC -> O(n) SC -> O(1)
    }
}
