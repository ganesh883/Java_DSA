package Interview_problem;

import java.util.ArrayList;
import java.util.List;

public class Merge_Intervals_Overlapping {
    public static void main(String[] args) {

        int[][] arr = { {1, 3}, {2, 6}, {8, 10}, {15, 18}};

        List<int[]> result = new ArrayList<>();

        int n = arr.length;
        int m = arr[0].length;

        int[] prev = arr[0];

        for(int i=1;i<n;i++){
            int[] curr = arr[i];

            if(prev[1] >= curr[0]){
                prev[1] = Math.max(prev[1],curr[1]);
            }
            else{
                result.add(prev);
                prev=curr;
            }
        }



    }
}
