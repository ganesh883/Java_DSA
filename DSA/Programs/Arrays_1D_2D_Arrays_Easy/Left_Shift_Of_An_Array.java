package Arrays_1D_2D_Arrays_Easy;

public class Left_Shift_Of_An_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;

        int first = arr[0];

        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }

        arr[n-1]=first;

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
