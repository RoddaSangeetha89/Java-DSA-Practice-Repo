class Solution {
    public int maxSubArray(int[] nums) {
        int curr=0,maxsum=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            curr+=nums[i];
            maxsum=Math.max(maxsum,curr);
            if(curr<0)
            {
                curr=0;
            }
        }
        return maxsum;
        
    }
}
