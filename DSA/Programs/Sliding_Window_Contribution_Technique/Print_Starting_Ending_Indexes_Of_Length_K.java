package Sliding_Window_Contribution_Technique;

public class Print_Starting_Ending_Indexes_Of_Length_K {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7};
        int n = arr.length;

        int k = 3;

        int start=0;
        int end = k-1;

        while(end<n){
            System.out.print(start+ "  "+end);
            System.out.println();
            start++;
            end++;
        }
    }
}
