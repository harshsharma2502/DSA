// class Solution {
//     public int findMaxConsecutiveOnes(int[] nums) 
//     {
//         int minCount = 0;
//         int maxCount = 0;
//         if(nums[0]==1 && nums.length == 1) return 1;
//         for(int i=0; i<nums.length-1; i++)
//         {
//             if(nums[i] == 1)
//             {
//                 minCount++;
//                 if(minCount>maxCount)
//                 {
//                 maxCount = minCount;
//                 }
//             }
//             else
//             minCount =0;
//         }
//         if(maxCount==0) return 0;
//         return maxCount;
//     }
// }
class Solution {
     public int findMaxConsecutiveOnes(int[] nums)
     {
        int maxi=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                count++;
            }
            else if(nums[i]==0)
            {
                if(count>maxi) maxi=count;
                count=0;
            }
        }
        if(maxi<count) maxi=count;
        return maxi;
     }
}