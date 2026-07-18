class Solution {
    public int robhelper(int[] nums){
          int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        int[] dp = new int[n];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
      
        for(int i=2;i<n;i++){
           dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[n-1];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n<2){
            return nums[0];
        }
        int[] skipFirstHouse=new int[n-1];
        int[] skipLastHouse=new int[n-1];
        for(int i=0;i<n-1;i++){
            skipFirstHouse[i]=nums[i];
            skipLastHouse[i]=nums[i+1];
        }
        int loot1=robhelper(skipFirstHouse);
        int loot2=robhelper(skipLastHouse);
    return Math.max(loot1,loot2);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna