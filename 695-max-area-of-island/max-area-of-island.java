class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;
        int area = 1;
        int maxarea = 0;
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] == 1) {
                    area = dfs(grid, r, c, m, n);
                    maxarea = Math.max(maxarea, area);
                }
            }
        }
        return maxarea;
    }

    public int dfs(int[][] grid, int r, int c, int rows, int cols) {
        if (r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] == 0) {
            return 0;
        }
        grid[r][c] = 0;
        int areaup = dfs(grid, r - 1, c, rows, cols);
        int areadown = dfs(grid, r + 1, c, rows, cols);
        int arealeft = dfs(grid, r, c - 1, rows, cols);
        int arearight = dfs(grid, r, c + 1, rows, cols);
        int area = 1 + areaup + areadown + arealeft + arearight;

        return area;
    }
}
