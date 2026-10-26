class Solution {
    public void FindSubset(int ind,int[] nums,List<Integer>ds,List<List<Integer>>ansls){
        ansls.add(new ArrayList<>(ds));
        for(int i=ind;i<nums.length;i++){
            if(i!=ind && nums[i]==nums[i-1])continue;
            ds.add(nums[i]);
            FindSubset(i+1,nums,ds,ansls);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ansls=new ArrayList<>();
        FindSubset(0,nums,new ArrayList<>(),ansls);
        return ansls;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna