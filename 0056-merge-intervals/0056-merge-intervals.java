class Solution {
    public int[][] merge(int[][] intervals) {
      Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
      List<int[]>ans=new ArrayList<>();
      for(int[]interval:intervals){
        if(ans.isEmpty()||interval[0]>ans.get(ans.size()-1)[1]){
            ans.add(interval);
        }
        else{
            ans.get(ans.size()-1)[1]=Math.max(ans.get(ans.size()-1)[1],interval[1]);
        }
      }
      return ans.toArray(new int[ans.size()][]);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna