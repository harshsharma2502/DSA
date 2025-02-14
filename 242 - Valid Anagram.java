// https://leetcode.com/problems/valid-anagram/description/
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] charCounts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++; 
        }

        for (int i = 0; i < t.length(); i++) {
            charCounts[t.charAt(i) - 'a']--; 
            if (charCounts[t.charAt(i) - 'a'] < 0) { 
                return false;
            }
        }

        return true; 
    }
}
// class Solution {
//     public boolean isAnagram(String s, String t) {
//         s = s.toLowerCase();
//         t = t.toLowerCase();

//         if (s.length() != t.length()) {
//             return false;
//         }

//         char[] sArray = s.toCharArray();
//         char[] tArray = t.toCharArray();

//         Arrays.sort(sArray);
//         Arrays.sort(tArray);

//         return Arrays.equals(sArray, tArray);
//     }
// }
