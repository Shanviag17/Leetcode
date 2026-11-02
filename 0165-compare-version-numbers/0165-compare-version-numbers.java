class Solution {
    public int compareVersion(String version1, String version2) {
        int n1=version1.length();
        int n2=version2.length();
        int i=0;
        int j=0;
        while(i<n1 || j<n2){
            int val1=0;
            int val2=0;
            while(i<n1 && version1.charAt(i) !='.'){
                val1=val1*10 + (version1.charAt(i)-'0');
                i++;
            }
            i++;

            while(j<n2 && version2.charAt(j) !='.'){
                val2=val2*10+(version2.charAt(j)-'0');
                j++;
            }
            j++;

            if(val1<val2)return -1;
            else if(val1>val2)return 1;
        }
        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna