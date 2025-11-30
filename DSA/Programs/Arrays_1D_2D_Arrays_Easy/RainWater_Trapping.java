package Arrays_1D_2D_Arrays_Easy;

public class RainWater_Trapping {
    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 2};
        int n = arr.length;

        int[] lMax = new int [n];
        lMax[0]=arr[0];

        for(int i=1;i<n;i++){
            lMax[i]=Math.max(lMax[i-1],arr[i]);
        }

        int[] rMax = new int[n];
        rMax[n-1]=arr[n-1];

        for(int i= n-2;i>=0;i--){
            rMax[i]=Math.max(rMax[i+1],arr[i]);
        }

        int ans = 0;

        for(int i=0;i<n;i++){
            int left = lMax[i];
            int right = rMax[i];
            int current = arr[i];

            ans = ans+ Math.abs((Math.min(left,right)-current));
        }
        System.out.println(ans);
    }
}
