// https://leetcode.com/problems/reverse-string/description/
class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int n = s.length;
        int end = n-1;
            while(start<end){
            char temp = s[end];
            s[end] = s[start];
            s[start] = temp;
            start++;
            end--;
        }

    }
}

