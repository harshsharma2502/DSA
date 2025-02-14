// https://leetcode.com/problems/valid-parentheses/description/

class Solution {
    public boolean isValid(String s) {
        while (true) {
            int originalLength = s.length();

            s = s.replace("[]", "");
            s = s.replace("()", "");
            s = s.replace("{}", ""); 

            if (s.isEmpty()) {
                return true;
            }

            if (s.length() == originalLength) {
                return false;
            }
        }
    }
}
