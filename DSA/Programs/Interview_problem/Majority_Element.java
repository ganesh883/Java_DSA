package Interview_problem;

public class Majority_Element {
    public static void main(String[] args) {
        int[] arr = {1,6,1,1,2,1};
        int n = arr.length;

        int Majority = arr[0];
        int count=0;

        for(int i=0;i<n;i++){
            if(arr[i]==Majority){
                count++;
            }
            else if(count==1){
                Majority=arr[i];
            }
            else{
                count--;
            }
        }

        System.out.println(Majority);
    }
}
