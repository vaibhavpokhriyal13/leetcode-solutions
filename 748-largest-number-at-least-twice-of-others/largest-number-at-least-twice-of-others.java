class Solution {
    public int dominantIndex(int[] nums) {
        int n=nums.length;
        int max=0;
        int idx=0;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                idx=i;
            }
        }

        for(int i=0;i<n;i++){
            if(nums[i]==max){
                continue;
            }
            else if(nums[i]*2>max){
                return -1;
            }
           
        }
        return idx;
        
    }
}