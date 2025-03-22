class Solution {
    public int maxSubArray(int[] nums) {
        int maxii = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum +=nums[i]; 

            if(sum > maxii){
                maxii = sum;
            }

            if(sum<0){
                sum = 0;
            }
        }
        return maxii;
    }
}



// class Solution {
//     public int maxSubArray(int[] nums) {
//         int maxi = 0;
//         for(int i=0; i<nums.length; i++){
//             for(int j=i; j<nums.length; j++){
//                 int sum = 0;
//                 for(int k=i; k<=j; k++){
//                     sum = sum + nums[k];
//                 }
//                 maxi = Math.max(sum,maxi);
//             }
//         }
//         return maxi;
//     }
// }