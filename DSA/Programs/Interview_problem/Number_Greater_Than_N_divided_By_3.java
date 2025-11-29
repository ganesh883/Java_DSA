package Interview_problem;

public class Number_Greater_Than_N_divided_By_3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1};
        int n = arr.length;

        int one = 0;
        int two = 0;

        int first = Integer.MIN_VALUE;
        int second  = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]==first){
                one++;
            }
            else if(arr[i]==second){
                two++;
            }
            else if(one==0){
                first=arr[i];
                one++;
            }
            else if(second==0){
                second=arr[i];
                second++;
            }
            else{
                one--;
                two--;
            }
        }

        one=0;
        two=0;


        for(int i=0;i<n;i++){
            if(arr[i]==first){
                one++;
            }
            else if(arr[i]==second){
                two++;
            }
        }

        if(one>n/3){
            System.out.println(first);
        }

        if(two>n/3){
            System.out.println(second);
        }
    }
}
