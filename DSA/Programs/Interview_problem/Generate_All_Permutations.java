package Interview_problem;

import java.util.Arrays;

public class Generate_All_Permutations {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        generateAllPermutations(arr,0);
    }

    public static void generateAllPermutations(int[] arr, int start){
        if(start==arr.length-1){
            System.out.println(Arrays.toString(arr));
            return;
        }

        for(int i=start;i<arr.length;i++){
            swap(arr,start,i);

            generateAllPermutations(arr,start+1);

            swap (arr,start,i);
        }
    }

    public static int[] swap(int[] arr, int i, int j){
        if(i!=j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        return arr;
    }
}
