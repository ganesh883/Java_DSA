package Arrays_1D_2D_Arrays_Easy;

public class Continous_Sum_Query_Beggers_Problem {
    public static void main(String[] args) {

        int A = 5;

        int[][] B = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
                int[] ans = new int[A];

                for(int i=0;i<B.length;i++){
                    int s = B[i][0];
                    int e = B[i][1];
                    int value = B[i][2];

                    ans[s-1] = ans[s-1] + value;

                    if(e<A){
                        ans[e] = ans[e] - value;
                    }

                }


                for(int i=1;i<A;i++){
                    ans[i]+=ans[i-1];
                }

        System.out.println(ans);
            }
        }