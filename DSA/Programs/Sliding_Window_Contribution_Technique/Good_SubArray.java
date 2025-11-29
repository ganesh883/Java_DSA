package Sliding_Window_Contribution_Technique;

public class Good_SubArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int B = 4;

        int sum =0;
        int ans=0;

        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                int len = j-i+1;
                if(len%2==0){
                    if(sum<B){
                        ans++;
                    }
                }
                else{
                    if(sum>B){
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
