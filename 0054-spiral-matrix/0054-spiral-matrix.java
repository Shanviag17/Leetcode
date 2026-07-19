class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int rowBegin=0;
        int colBegin=0;
        int rowEnd=row-1;
        int colEnd=col-1;
        List<Integer>ans=new ArrayList<>();
        while(rowBegin<=rowEnd && colBegin <=colEnd){
            //traverse topright
            for(int i=colBegin;i<=colEnd;i++){
               ans.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            //traversebottom right
            for(int i=rowBegin;i<=rowEnd;i++){
                ans.add(matrix[i][colEnd]);
            }
            colEnd--;
            //traversebottomdown
            if(rowBegin<=rowEnd){
            for(int i=colEnd;i>=colBegin;i--){
               ans.add(matrix[rowEnd][i]);
            }
            rowEnd--;
            }
            //traverse rightside
            if(colBegin<=colEnd){
            for(int i=rowEnd;i>=rowBegin;i--){
                ans.add(matrix[i][colBegin]);
            }
            colBegin++;
           }
     }
     return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna