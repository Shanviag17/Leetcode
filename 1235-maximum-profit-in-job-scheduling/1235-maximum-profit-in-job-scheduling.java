
import java.util.*;

class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int[][] jobs = new int[n][3];

        for (int i = 0; i < n; i++) {
            jobs[i][0] = startTime[i];
            jobs[i][1] = endTime[i];
            jobs[i][2] = profit[i];
        }

        Arrays.sort(jobs, (a, b) -> Integer.compare(a[1], b[1]));

        int[] dp = new int[n + 1];
        int[] ends = new int[n];

        for (int i = 0; i < n; i++) {
            ends[i] = jobs[i][1];
        }

        for (int i = 1; i <= n; i++) {
            int start = jobs[i - 1][0];
            int currentProfit = jobs[i - 1][2];

            int low = 0, high = i - 2;
            int prev = -1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (ends[mid] <= start) {
                    prev = mid;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            int take = currentProfit + dp[prev + 1];
            int skip = dp[i - 1];

            dp[i] = Math.max(take, skip);
        }

        return dp[n];
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna