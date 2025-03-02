class Solution {
    public int majorityElement(int[] nums) {
        int num = nums[0];
        int count = 0;
        for (int i : nums) {
            if (count == 0) {
                num = i;
            }
            count += (i == num) ? 1 : -1;
        }

        return num;
    }
}