class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) { // Loop over columns
                sum += accounts[i][j]; // Correct way to sum wealth
            }
            max = Math.max(max, sum); // Update max wealth
        }
        
        return max;
    }
}
