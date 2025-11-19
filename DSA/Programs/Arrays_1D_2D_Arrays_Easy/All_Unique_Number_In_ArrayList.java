package Arrays_1D_2D_Arrays_Easy;

import java.util.ArrayList;

public class All_Unique_Number_In_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(2);
        arr.add(5);

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<arr.size();i++){
            if(checkFreq(arr,arr.get(i))==1){
                ans.add(arr.get(i));
            }
        }

        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }

    public static int checkFreq(ArrayList arr,int num){
        int freq = 0;

        for(int i=0;i<arr.size();i++){
            if(arr.get(i).equals(num)){
                freq++;
            }
        }

        return freq;
    }
}
