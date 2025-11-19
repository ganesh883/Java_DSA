package Arrays_1D_2D_Arrays_Easy;

public class Identity_Matrix {
    public static void main(String[] args) {
        int[][] arr = {{1,0,0},{0,1,0},{0,0,1}};
        int n = arr.length;
        int m = arr[0].length;

        int flag=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                if(i==j && arr[i][j]!=1){
                    flag=1;
                }
                if(i!=j && arr[i][j]!=0){
                    flag=1;
                }
            }

        }

        if(flag==0){
            System.out.print("It is an Identity Matrix");
        }
        else{
            System.out.print("It is not an Identity Matrix");
        }
    }
}
