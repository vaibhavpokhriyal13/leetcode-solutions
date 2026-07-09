class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> arr=new ArrayList<>();
        printSubsets(nums,new ArrayList<>(),arr,0);
        return arr;
        
    }
    public void printSubsets(int[] nums,List<Integer> current,List<List<Integer>> arr,int i){
        if(i==nums.length){
            arr.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[i]);
        printSubsets(nums,current,arr,i+1);
        current.remove(current.size()-1);
        printSubsets(nums,current,arr,i+1);


    }
}