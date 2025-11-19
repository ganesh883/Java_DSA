package Arrays_1D_2D_Arrays_Easy;

public class Reverse_An_Array {
    public static void main(String[] args) {


        // Two Pointers approach

        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;

        int first = 0;
        int last = arr.length-1;

        while(first<last){
            int temp = arr[first];
            arr[first]= arr[last];
            arr[last]= temp;
            first++;
            last--;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

//TC: O(n)
//SC:O(1)


// Normal reverse - i to n but in new arr will have both TC and SC has O(n)