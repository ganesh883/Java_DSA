package Arrays_1D_2D_Arrays_Easy;

public class Flip_0_and_1 {
    public static void main(String[] args) {

        String A = "101";
        int n = A.length();
        int maxSum = 0, currentSum = 0;
        int start = 0;
        int bestL = -1, bestR = -1;

        for (int i = 0; i < n; i++) {
            int val = (A.charAt(i) == '0') ? 1 : -1;

            currentSum += val;

            if (currentSum > maxSum) {
                maxSum = currentSum;
                bestL = start;
                bestR = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                start = i + 1;
            }
        }
        System.out.println(bestL + " "+ bestR);
    }

}
