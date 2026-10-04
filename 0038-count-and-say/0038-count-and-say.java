class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String res=countAndSay(n-1);
        int count=1;
        char curr=res.charAt(0);
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<res.length();i++){
            if(res.charAt(i)==curr){
                count++;
            }else{
                sb.append(count).append(curr);
                count=1;
                curr=res.charAt(i);
            }
        }
        if(count>0){
            sb.append(count).append(curr);
        }
        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna