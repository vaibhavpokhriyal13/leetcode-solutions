class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> arr=new ArrayList<>();
        findsum(candidates,arr,new ArrayList<>(),target,0);
        return arr;
    }
    public void findsum(int[] nums,List<List<Integer>> arr,List<Integer> curr,int target,int i){
        if(target==0){
            arr.add(new ArrayList<>(curr));
            return;
        }
        if (target < 0){
        return;
        }

        if (i == nums.length){
        return;
        }
        curr.add(nums[i]);
        
        findsum(nums,arr,curr,target-nums[i],i);
        curr.remove(curr.size()-1);
        findsum(nums,arr,curr,target,i+1);
        
    }
}