class Solution {
    public int maxSubArray(int[] nums) {

        int n=nums.length;
        int maxA=nums[0];
        int currA=nums[0];
        for(int i=1;i<n;i++){
            currA=Math.max(nums[i],currA+nums[i]);
            maxA=Math.max(maxA,currA);
        }
        return maxA;
        
    }
}