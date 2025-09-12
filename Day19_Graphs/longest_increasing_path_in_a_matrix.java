class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean[][] vis = new boolean[n][m];

        // Use DP to overcome TLE;
        int[][] dp = new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int longest = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                longest = Math.max(longest,dfs(matrix,dp,vis,i,j,1));
            }
        }
        return longest;
    }
    static int dfs(int[][] mat, int[][] dp, boolean[][] vis, int row, int col, int len){
        int n = mat.length;
        int m = mat[0].length;
        if(dp[row][col]!=-1) return dp[row][col];
        vis[row][col] = true;
        int[] dir = {-1,0,1,0,-1};
        for(int i=0;i<4;i++){
            int nrow = row+dir[i];
            int ncol = col+dir[i+1];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && !vis[nrow][ncol] && mat[nrow][ncol]>mat[row][col]){
                len = Math.max(len,1+dfs(mat,dp,vis,nrow,ncol,1));       
            }
        }
        vis[row][col] = false;
        return dp[row][col]=len;
    }
}
