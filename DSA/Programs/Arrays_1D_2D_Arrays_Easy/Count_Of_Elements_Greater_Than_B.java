package Arrays_1D_2D_Arrays_Easy;

public class Count_Of_Elements_Greater_Than_B {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,5,5,3,32,3,4,5};

        int n = arr.length;

        int B = 4;

        for(int i=0;i<n;i++){
            if(arr[i]>B){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
