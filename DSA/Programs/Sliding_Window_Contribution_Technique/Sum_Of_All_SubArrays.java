package Sliding_Window_Contribution_Technique;

public class Sum_Of_All_SubArrays {
    public static void main(String[] args) {

        int[] arr = {4,3,7,6};
        int n = arr.length;


      //   Brutefroce - TC O(n3)
        int sum = 0;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
            }
        }
        System.out.println(sum);

      //  prefix sum - TC O(n2) SC O(n)
        int[] psum = new int[n];
        psum[0]=arr[0];
        for(int i=1;i<n;i++){
            psum[i]=psum[i-1]+arr[i]; //[4,7,14,20]
        }

      //  int sum =0;
        int total=0;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(i==0){
                   sum=psum[j];
                }
                else{
                    sum=psum[j]-psum[i-1];
                }
                total+=sum;
            }
        }
        System.out.println(total);


    //    Carry Forward TC O(n2) SC O(1)

      //  int sum =0;
      ///  int total =0 ;

        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                total+=sum;
            }
        }
        System.out.println(total);

        //Contribution Method TC O(n) SC O(1)
        int freq=0;
       // int total=0;

        for(int i=0;i<n;i++){
            int s = i+1;
            int e = n-i;

            freq=s*e;

            total+=arr[i]*freq;
        }
        System.out.println(total);





    }
}
