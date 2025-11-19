package Arrays_1D_2D_Arrays_Easy;

public class Second_Largest_Number_In_An_Array {
    public static void main(String[] args) {
        int[] arr = {2,1,2};
        int n = arr.length;

        // BruteForce
        // Sort the array -> iterate from last and return A[i-1]<A[i] value else return -1 -> TC: O(n log(n)) SC: O(1)

        //Optimized
        // Maintain two variable If the current number > largest → update both
        //Else if current number > secondLargest AND not equal to largest → update secondLargest
        // TC: O(n) SC: O(1)

        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int num = arr[i];

            if(num>largest){
                second_largest=largest;
                largest=num;
            }
            else if(num>second_largest && num!=largest){
                second_largest=num;
            }
        }
        System.out.println(second_largest);
            // TC: O(n) SC: O(1)
    }
}
