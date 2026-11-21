import java.util.Arrays;

public class ClimbingStairs {
//    private static int climbStairs(int n) {
//        if (n == 0) {
//            return 1;
//        }
//        if (n < 0) {
//            return 0;
//        }
//        return climbStairs(n - 1) + climbStairs(n - 2);
//    }

    // Memoization == dp
    // By using dp

//    static int[] dp;
//
//    private static int climbStairs(int n) {
//        dp = new int[46];
//        Arrays.fill(dp, -1);
//        return solve(n);
//    }
//
//    private static int solve(int n) {
//        if (n < 0) {
//            return 0;
//        }
//        if (dp[n] != -1) {
//            return dp[n];
//        }
//        if (n == 0) {
//            return 1;
//        }
//
//        int a = solve(n - 1);
//        int b = solve(n - 2);
//
//        return dp[n] = a + b;

    // By Using Bottom Up Approach

//    private static int climbStairs(int n) {
//        if (n == 1 || n == 2) {
//            return n;
//        }
//        int[] dp = new int[n + 1];
//        dp[0] = 0;
//        dp[1] = 1;
//        dp[2] = 2;
//
//        for (int i = 3; i <= n; i++) {
//            dp[i] = dp[i - 1] + dp[i - 2];
//        }
//        return dp[n];
//    }

    // By using Constant Space TC.
    private static int climbStairs(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) {
            return n;
        }
        int a = 1;
        int b = 2;
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(0));
    }
}
