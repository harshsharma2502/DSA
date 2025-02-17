class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][0];
        }

        int[][] arr = new int[m][n]; // Correct dimensions: m rows, n columns
        int index = 0;

        for (int i = 0; i < m; i++) { // Iterate through rows (m)
            for (int j = 0; j < n; j++) { // Iterate through columns (n)
                arr[i][j] = original[index++];
            }
        }

        return arr;
    }
}