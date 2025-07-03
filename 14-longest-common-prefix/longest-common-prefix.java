public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        // Start with the first string as the prefix
        String prefix = strs[0];

        // Compare with each string
        for (int i = 1; i < strs.length; i++) {
            // While the prefix is not at the beginning of the current string
            while (strs[i].indexOf(prefix) != 0) {
                // Reduce the prefix length by one
                prefix = prefix.substring(0, prefix.length() - 1);
                // If the prefix is empty, return ""
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}