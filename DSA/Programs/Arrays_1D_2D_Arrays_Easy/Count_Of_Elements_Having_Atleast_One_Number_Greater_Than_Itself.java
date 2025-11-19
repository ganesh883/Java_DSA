package Arrays_1D_2D_Arrays_Easy;

public class Count_Of_Elements_Having_Atleast_One_Number_Greater_Than_Itself {
    public static void main(String[] args) {


        //First we will think that simply we can get answer by n-1 but if max number repeats it fails,
        // so we have to take the max number and get the count and subtract it from the n


        int arr[] = {1,2,3,4,5,5};

        int n = arr.length;

        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            max= Math.max(arr[i],max);
        }


        int count=0;

        for(int i=0;i<n;i++){
            if(arr[i]==max){
                count++;
            }
        }

        System.out.println(n-count);


    }
}
