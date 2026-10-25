import java.util.*;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n=g.length;
        int m=s.length;
        int l=0;
        int r=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(l<n && r<m){
            if(s[r]>=g[l]){
                l++;
            }
            r++;
        }
        return l;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna