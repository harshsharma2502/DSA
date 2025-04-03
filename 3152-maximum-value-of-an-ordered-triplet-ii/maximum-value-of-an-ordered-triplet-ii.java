class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        if(n<3) return 0;
        int prefix[] = new int[n];
        int sufix[] = new int[n];
        prefix[0] = nums[0];
        for(int i=1; i<n; i++)
        {
            prefix[i] = Math.max(nums[i],prefix[i-1]);
        }

        sufix[n-1] = nums[n-1];
        for(int i=n-2; i>=0; i--)
        {
            sufix[i] = Math.max(nums[i],sufix[i+1]);
        }

        long ans = 0;
        for(int i=1; i<n-1; i++)
        {
            long leftMax = prefix[i-1];
            long rightMax = sufix[i+1];
            long x = (leftMax- nums[i])*rightMax;
            ans = Math.max(ans,x);
        
        }
            return ans;
    }
}