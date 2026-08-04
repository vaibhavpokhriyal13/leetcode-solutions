class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();

        int n = nums.length;
        int i = 0;

        while (i < n) {
            int start = i;

            // Expand the current range while numbers are consecutive
            while (i + 1 < n && nums[i + 1] == nums[i] + 1) {
                i++;
            }

            int end = i;

            // Add the range to the answer
            if (start == end) {
                ans.add(String.valueOf(nums[start]));
            } else {
                ans.add(nums[start] + "->" + nums[end]);
            }

            i++;
        }

        return ans;
    }
}