class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s.trim();

        char ss[] = s.toCharArray();
        int start = 0;
        int end = ss.length-1;

        while(start<end)
        {
            if(!Character.isLetterOrDigit(ss[start]))
            {
                start++;
                continue;
            }

            if(!Character.isLetterOrDigit(ss[end])) {
            {
                end--;
                continue;
            }
            }

            if(ss[start] != ss[end]) return false;

            start++;
            end--;
        }
        return true;
    }
}