class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int fresh = 0;
        Queue<int[]> queue = new LinkedList<>();
        for(int r=0; r<rows; r++){
            for(int c=0; c<cols; c++){
                if(grid[r][c] == 2){
                    queue.add(new int[]{r, c});
                }
                else if(grid[r][c] == 1){
                    fresh++;
                }
            }
        }
        if(fresh == 0){
            return 0;
        }

        int[][] directions = {
            {1, 0}, // down
            {-1, 0}, // up
            {0, 1}, // right
            {0, -1}, // left
        };
        int minute = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            boolean rottedthismin = false;
            for(int i=0; i<size; i++){
                int[] cell = queue.poll();
                int r = cell[0];
                int c = cell[1];
                for(int[] dir:directions){
                    int nr = r + dir[0];
                    int nc = c + dir[1];

                    if(nr>=0 && nr<rows && nc>=0 && nc<cols && grid[nr][nc] == 1){
                        grid[nr][nc] = 2;
                        fresh--;
                        queue.add(new int[]{nr, nc});
                        rottedthismin = true;
                    }
                }
            }
            if(rottedthismin){
                minute++;
            }
        }
        return fresh == 0 ? minute : -1;
    }
}