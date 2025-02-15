class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;
        Set<Integer> visited = new HashSet<>(); // Keep track of visited numbers

        for (int num : nums) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1) && !visited.contains(currentNum + 1)) { // Check if visited
                    currentNum++;
                    currentStreak++;
                    visited.add(currentNum); // Mark as visited
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}