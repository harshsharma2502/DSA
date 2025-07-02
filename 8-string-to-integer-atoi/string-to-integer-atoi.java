class Solution {
    public int myAtoi(String s) {
        long num = 0;

        s = s.trim();
        int sign = 1;
        int i = 0;
        if (s.length() == 0) return 0;

        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            sign  = 1;
            i++;
        }

        while (i < s.length()) {
            if (!Character.isDigit(s.charAt(i))) {
                return (int) (sign * num);
            }

            num = num * 10 + (s.charAt(i) - '0');

            if (sign == 1 && num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -num < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return (int) (sign * num);
    }
}
