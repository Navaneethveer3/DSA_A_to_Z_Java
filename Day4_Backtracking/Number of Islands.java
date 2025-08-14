class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        int islands = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j] && grid[i][j]=='1'){
                    islands++;
                    dfs(grid,vis,i,j);
                }
            }
        }
        return islands;
    }
    static void dfs(char[][] grid, boolean[][] vis, int i, int j){
        int n = grid.length;
        int m = grid[0].length;
        vis[i][j] = true;
        int[] dir = {-1,0,1,0,-1};
        for(int k=0;k<4;k++){
            int row = dir[k]+i;
            int col = dir[k+1]+j;
            if(row>=0 && row<n && col>=0 && col<m && !vis[row][col] && grid[row][col]=='1'){
                dfs(grid,vis,row,col);
            }
        }
    }
}
