class Solution {
    public int[] rearrangeArray(int[] nums) {
        int odd = 1;
        int even = 0;
        int temp [] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                temp[even] = nums[i];
                even +=2;
            }
            else{
                temp[odd] = nums[i];
                odd +=2;
            }
        }
        return temp;
    }
}