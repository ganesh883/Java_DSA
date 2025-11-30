package Interview_problem;

public class Number_Of_Digit_One {
    public static void main(String[] args) {

//        for (int i = 1; i <= n; i++) {
//            while (num > 0) {
//                if (num % 10 == 1) count++;
//                num /= 10;
//            }
//        }

        int n = 121;

        int count = 0;
        for (long factor = 1; factor <= n; factor *= 10) {
            long lower = n % factor;
            long current = (n / factor) % 10;
            long higher = n / (factor * 10);

            if (current == 0)
                count += higher * factor;
            else if (current == 1)
                count += higher * factor + (lower + 1);
            else
                count += (higher + 1) * factor;
        }
        System.out.println(count);

    }
}
