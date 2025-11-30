package Arrays_1D_2D_Arrays_Easy;

public class Kadanes_Algorithm {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, -10};
        int n = arr.length;

       int sumTillNow = arr[0];
       int MaxSum = arr[0];

       for(int i=1;i<n;i++){
           if(sumTillNow<0){
               sumTillNow=0;
           }
           sumTillNow+=arr[i];

           MaxSum=Math.max(MaxSum,sumTillNow);
       }
        System.out.println(MaxSum);
    }
}
