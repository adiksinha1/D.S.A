class Solution {
    public int missingInteger(int[] nums) {

        int sum = nums[0];

        int i = 0;

        while (i < nums.length - 1 &&
               nums[i + 1] == nums[i] + 1) {

            i++;
            sum += nums[i];
        }

        while (contains(nums, sum)) {
            sum++;
        }

        return sum;
    }

    public boolean contains(int[] nums, int x) {
        for (int num : nums) {
            if (num == x)
                return true;
        }

        return false;
    }
}