// https://leetcode.com/problems/palindrome-number/description/
class Solution {
    public boolean isPalindrome(int x) {
        int temp = x ,sum=0;
        while(x>0){
            int r = x % 10;
            sum = (sum*10) + r;
            x = x / 10;
        }
        if(sum == temp){
            return true;
        }
        return false;
    }
}
