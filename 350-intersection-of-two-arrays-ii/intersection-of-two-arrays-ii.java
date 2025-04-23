class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int res[] = new int [1001];
        for(int num : nums1)
        {
            res[num]++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums2)
        {
            if(res[num] > 0)
            {
                list.add(num);
                res[num]--;
            }
        }
        int result[] = new int[list.size()];
        int i=0;
        for(int num : list)
        {
            result[i] = num;
            i++;
        }
        return result;
    }
}