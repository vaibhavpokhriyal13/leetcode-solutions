class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet <Integer> set=new HashSet<>();
        List<Integer> a=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                a.add(i);
            }
    }
    return a;
        
    }
}