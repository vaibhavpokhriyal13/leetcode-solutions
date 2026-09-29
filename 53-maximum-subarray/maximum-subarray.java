class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int ans=nums[0];
        int currA=nums[0];

        for(int i=1;i<n;i++){
            currA=Math.max(nums[i],currA+nums[i]);
            ans=Math.max(currA,ans);
        }
        return ans;
    }
}