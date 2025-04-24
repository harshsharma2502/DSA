// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i=0; i<nums.length; i++){
//             map.put(nums[i],i);
//         }

//         for(int i=0; i<nums.length; i++){
//             int num = nums[i];
//             int rem = target-num;
//             if(map.containsKey(rem)){
//                 int index = map.get(rem);
//                 if(index == i)continue;
//                 return new int[]{i,index};
//             }
//         }
//         return new int[]{};
//     }
// }





// Brute Force
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length;
//         for(int i=0; i<n; i++){
//             for(int j=1; j<n; j++){
//                 if(nums[i] + nums[j] == target){
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         return new int[]{};
// }
// }



class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap();
        for(int i=0; i<nums.length; i++){
            hm.put(nums[i],i);
        }
        
        for(int i=0; i<nums.length; i++){
            int rem = target - nums[i];
            int index;
            if(hm.containsKey(rem)){
                index = hm.get(rem);
                if(index == i)continue;
                return new int[]{i,index};
            }
        }
        return new int[]{};
    }
}