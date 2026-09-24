class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result=new StringBuilder();
        Arrays.sort(strs);
        char[] first=strs[0].toCharArray();
        char[] last=strs[strs.length-1].toCharArray();
        for(int i=0;i<first.length;i++){
            if(first[i] != last[i])
               break;
            result.append(first[i]);
        }
        return result.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna