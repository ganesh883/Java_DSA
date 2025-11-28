package CarryForwardSubarrays;

import java.util.ArrayList;

public class Leaders_In_An_Array {
    public static void main(String[] args) {

        int[] arr  = {16, 17, 4, 3, 5, 2};

        int n = arr.length;

        int value = arr[n-1];

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(value);

        for(int i=n-2;i>=0;i--){
            if(arr[i]>value){
                ans.add(arr[i]);
                value=arr[i];
            }
        }


        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
