import java.util.Arrays;

public class HouseRobber {

    // Top Down Approach (TLE)
//    private static int rob(int[] nums) {
//        return solve(nums, 0);
//    }
//
//    private static int solve(int[] nums, int i) {
//        if (i >= nums.length) {
//            return 0;
//        }
//        int steal = nums[i] + solve(nums, i + 2);
//        int skip = solve(nums, i + 1);
//        return Math.max(steal, skip);
//    }


    // Top Down + Memoization approach
    static int[] dp;

    private static int rob(int[] nums) {
        dp = new int[101];
        Arrays.fill(dp, -1);
        int n = nums.length;
        return solve(nums, 0, n);
    }

    private static int solve(int[] nums, int i, int n) {
        if (i >= n) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int steal = nums[i] + solve(nums, i + 2, n);
        int skip = solve(nums, i + 1, n);
        return dp[i] = Math.max(steal, skip);
    }
}
