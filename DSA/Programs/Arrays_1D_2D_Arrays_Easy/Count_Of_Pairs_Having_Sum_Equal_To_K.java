package Arrays_1D_2D_Arrays_Easy;

public class Count_Of_Pairs_Having_Sum_Equal_To_K {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int k = 6;
        int count=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==k){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
