class Solution {
    private void backtrack(List<List<Integer>>ans,ArrayList<Integer>temp,int[] nums){
       if(temp.size()==nums.length){
        ans.add(new ArrayList<>(temp));
        return;
       }
        for(int num:nums){
            if(temp.contains(num))continue;
            temp.add(num);

            backtrack(ans,temp,nums);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>>ans=new ArrayList<>();
       backtrack(ans,new ArrayList<>(),nums);
       return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna