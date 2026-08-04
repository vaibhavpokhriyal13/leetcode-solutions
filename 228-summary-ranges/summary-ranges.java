class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int start=i;
            while(i+1<n && nums[i+1]==nums[i]+1){
                i++;
            }
            if(start==i){
                ans.add(String.valueOf(nums[start]));
            }
            else{
                ans.add(nums[start]+"->"+nums[i]);
            }
        }
        return ans;
    }
}