package Interview_problem;

public class Next_Permutation {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int n = arr.length;

        int i = n - 2;

        // 1. Find first decreasing element
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // If no decreasing element found -> last permutation -> reverse to first
        if (i == -1) {
            reverse(arr, 0, n - 1);
        } else {
            // 2. Find element just larger than arr[i]
            int j = n - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }

            // 3. Swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            // 4. Reverse the remaining right side
            reverse(arr, i + 1, n - 1);
        }

        // Print
        for (int l = 0; l < n; l++) {
            System.out.print(arr[l] + " ");
        }
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
