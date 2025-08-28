class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;

        // process diagonals starting from first column (bottom-left including main diagonal)
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            int r = i, c = 0;

            while (r < n && c < n) {
                list.add(grid[r][c]);
                r++;
                c++;
            }

            // sort in non-increasing order
            Collections.sort(list, Collections.reverseOrder());

            r = i; c = 0; 
            int idx = 0;
            while (r < n && c < n) {
                grid[r][c] = list.get(idx++);
                r++;
                c++;
            }
        }

        // process diagonals starting from first row (top-right, excluding main diagonal)
        for (int j = 1; j < n; j++) {
            List<Integer> list = new ArrayList<>();
            int r = 0, c = j;

            while (r < n && c < n) {
                list.add(grid[r][c]);
                r++;
                c++;
            }

            // sort in non-decreasing order
            Collections.sort(list);

            r = 0; c = j;
            int idx = 0;
            while (r < n && c < n) {
                grid[r][c] = list.get(idx++);
                r++;
                c++;
            }
        }

        return grid;
    }
}