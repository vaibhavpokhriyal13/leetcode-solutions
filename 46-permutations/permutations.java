class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> arr=new ArrayList<>();
        getParam(nums,arr,0);
        return arr; 
    }

    public void getParam(int[] nums,List<List<Integer>> arr,int i){
        if(i==nums.length){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                temp.add(nums[j]);
            }
            arr.add(temp);
            return;

        }
        for(int k=i;k<nums.length;k++){
            swap(nums,i,k);
            getParam(nums,arr,i+1);
            swap(nums,i,k);
        }
    }




      public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}