import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[nums.length - 1];

        int j = 0;

        for (int i = min; i <= max; i++) {

            while (j < nums.length && nums[j] < i) {
                j++;
            }

            if (j < nums.length && nums[j] == i) {
                j++;
            } else {
                list.add(i);
            }
        }

        return list;
    }
}