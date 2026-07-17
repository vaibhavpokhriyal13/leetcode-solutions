class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List <List<Integer>> arr=new ArrayList<>();
        printS(nums,new ArrayList<>(),arr,0);
        return arr;
        
    }
    public void printS(int[] nums,List<Integer> curr,List<List<Integer>> arr,int i) {
        if(i==nums.length){
            arr.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[i]);
        printS(nums,curr,arr,i+1);
        curr.remove(curr.size()-1);
        printS(nums,curr,arr,i+1);

        
    }
}