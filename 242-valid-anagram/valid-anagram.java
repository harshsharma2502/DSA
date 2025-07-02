class Solution {
    public boolean isAnagram(String s, String t) {
     s = s.toLowerCase();
     t = t.toLowerCase();

     if(s.length() != t.length()) return false;

     char ss[] = s.toCharArray();
     char tt[] = t.toCharArray();

     Arrays.sort(ss);
     Arrays.sort(tt);

     if(!Arrays.equals(ss,tt)) return false;

     return true;   
    }
}