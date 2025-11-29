package Interview_problem;

public class Count_Increasing_Triplets {
    public static void main(String[] args) {

        int[] arr = {1,2,4,3};
        int n = arr.length;
        int count=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]<arr[j] && arr[j]<arr[k]){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
