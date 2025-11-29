package Sliding_Window_Contribution_Technique;

public class Counting_Of_SubArray {
    public static void main(String[] args) {
        int[] arr = {2,5,6};
        int B=10;
        int n = arr.length;

        int sum =0;
        int count=0;

        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum<B){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
