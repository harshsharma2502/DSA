class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new  HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        map.forEach((Key,Value)->{
            if(Value>nums.length/3){
                list.add(Key);
            }
        });
        return list;
    }
}