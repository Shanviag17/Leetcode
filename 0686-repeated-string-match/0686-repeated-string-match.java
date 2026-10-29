class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder temp=new StringBuilder(a);
        int count=1;
        while(temp.length()<b.length()){
            temp.append(a);
            count++;
        }
        if(temp.toString().contains(b)){
            return count;
        }
        if(temp.append(a).toString().contains(b)){
            return count+1;
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna