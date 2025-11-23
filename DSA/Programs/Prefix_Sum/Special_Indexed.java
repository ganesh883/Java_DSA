package Prefix_Sum;

public class Special_Indexed {
    public static void main(String[] args) {

        int[] arr = {4,3,2,7,6,-2};
        int n = arr.length;

        int POdd[] = new int[arr.length];
        int PEven[] = new int[arr.length];

        POdd[0]=0;
        PEven[0]=arr[0];

        for(int i=1;i<n;i++){
            if(i%2==0){
                PEven[i] = PEven[i-1]+arr[i];
                POdd[i]=POdd[i-1];
            }
            else{
                POdd[i]=POdd[i-1]+arr[i];
                PEven[i]=PEven[i-1];
            }
        }

        int evenSum=0;
        int oddSum = 0;
        int answer=0;

        for(int i=0;i<n;i++){
            if(i==0){
                evenSum=POdd[n-1]-POdd[i];
                oddSum=PEven[n-1]-PEven[i];
            }
            else{
                evenSum=PEven[i-1]+(POdd[n-1]-POdd[i]);
                oddSum=POdd[i-1]+(PEven[n-1]-PEven[i]);
            }

            if(evenSum==oddSum){
                answer=i;
            }
        }

        System.out.println(answer);
    }
}
