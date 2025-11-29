package Interview_problem;

public class Length_Of_Longest_Consecutive_ones {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,1,1,1,0,1};
        int n = arr.length;

        int countOfOnes = 0;

        for(int i=0;i<n;i++){
            if(arr[i]==1){
                countOfOnes++;
            }
        }

        int ans = 0;

        for(int i=0;i<n;i++){
            if(arr[i]==0){
                int l=0;
                int r=0;

                for(int j=i-1;j>=0;j--){
                    if(arr[j]==1) {
                        l++;
                    }
                    else{
                        break;
                    }
                }

                for(int j=i+1;j<n;j++){
                    if(arr[j]==1){
                        r++;
                    }
                    else{
                        break;
                    }
                }

                int len = l+r;
                if(len<countOfOnes){
                    len++;
                }
                ans = Math.max(len,ans);
            }
        }
        System.out.println(ans);
    }
}
