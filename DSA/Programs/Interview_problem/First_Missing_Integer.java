package Interview_problem;

public class First_Missing_Integer {
    public static void main(String[] args) {

        int[] arr = {3,4,-1,1};
        int n = arr.length;

       for(int i=0;i<n;i++){
           while(arr[i]>0 && arr[i]<=n && arr[arr[i]-1] != arr[i]){
               int correctIndex = arr[i]-1;
               int temp = arr[i];
               arr[i]=arr[correctIndex];
               arr[correctIndex] = temp;
           }
       }

       for(int i=0;i<n;i++){
           if(arr[i] != i+1){
               System.out.println(i+1);
           }
       }




    }
}
