class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums1.length; i++)
        {
            set.add(nums1[i]);
        }
        HashSet<Integer> res = new HashSet<>();
        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i])){
            res.add(nums2[i]);
        }
        }
        int n = res.size();
        int result[] = new int[n];
        int i=0;
        for(int num: res){
            result[i] = num;
            i++;
        }
        return result;
    }
}