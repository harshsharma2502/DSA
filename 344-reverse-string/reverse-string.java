class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int n = s.length;
        int end = n-1;
        while(start<end)
        {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            end--;
            start++;
        }
    }
}