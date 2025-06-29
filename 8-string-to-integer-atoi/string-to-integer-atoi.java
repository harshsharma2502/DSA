class Solution {
    public boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    public int myAtoi(String s) {
        // Step 1: Remove leading whitespaces
        s = s.trim();
        if (s.length() == 0) return 0;

        int i = 0;
        int sign = 1;
        int num = 0;

        // Step 2: Handle sign
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        // Step 3: Convert digits and handle overflow
        while (i < s.length() && isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Check for overflow
            if (num > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            num = num * 10 + digit;
            i++;
        }

        return num * sign;
    }
}
