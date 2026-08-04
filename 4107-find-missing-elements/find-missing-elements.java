class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        Arrays.sort(nums);

        List<Integer> a = new ArrayList<>();

        int j = nums[0];

        for(int i = 0; i < nums.length; i++) {

            while(j < nums[i]) {
                a.add(j);
                j++;
            }

            j = nums[i] + 1;
        }

        return a;
    }
}