class Solution {
    public int strStr(String haystack, String needle) {
        // Edge case: If the needle is an empty string, return 0
        if (needle.isEmpty()) {
            return 0;
        }
        
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        
        // Loop through the haystack, but only up to the point where the remaining
        // characters are at least as long as the needle
        for (int i = 0; i <= haystackLength - needleLength; i++) {
            // Check if the substring of haystack starting at i matches the needle
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;  // Return the starting index of the first match
            }
        }
        
        // If no match is found, return -1
        return -1;
    }
}
