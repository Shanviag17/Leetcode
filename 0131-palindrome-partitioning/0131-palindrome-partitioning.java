class Solution {
    public List<List<String>> partition(String s){
        List<List<String>> res=new ArrayList<>();
        List<String> path=new ArrayList<>();
        func(0,s,path,res);
        return res;
    }
 
    void func(int idx,String s,List<String> path,List<List<String>> res){
        //base case
        if(idx==s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=idx;i<s.length();++i){
            if(isPalindrome(s,idx,i)){
                path.add(s.substring(idx,i+1));
                func(i+1,s,path,res);
                path.remove(path.size()-1);
            }
        }
    }
    boolean isPalindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna