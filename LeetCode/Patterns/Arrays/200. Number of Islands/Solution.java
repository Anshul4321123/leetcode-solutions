class Solution {
    public int numIslands(char[][] grid) {
        int row=grid.length;
        int col=grid[0].length;

        boolean[][] visited=new boolean[row][col];
        int count=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    dfs(grid,i,j,visited);
                    count++;
                }
            }
        }
        return count;
    }

public static void dfs(char[][] grid,int row,int col,boolean[][] visited){
    int[] p1={-1,0,0,1};
    int[] p2={0,-1,1,0};

    visited[row][col]=true;

    for(int i=0;i<4;i++){
        int nr=row+p1[i];
        int nc=col+p2[i];

        if(isSafe(grid,nr,nc,visited)){
            dfs(grid,nr,nc,visited);
        }
    }
}

public static boolean isSafe(char[][] grid,int r,int c,boolean[][] visited){
    int row=grid.length;
    int col=grid[0].length;

return (r>=0) && (c>=0) && (r<row) && (c<col) && (grid[r][c]=='1' && !visited[r][c]);
}

}