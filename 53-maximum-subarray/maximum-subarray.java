class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0], max = nums[0]; ;
        for(int i = 1; i < nums.length; i++)
        {
            max = Math.max(nums[i], max+nums[i]);
            sum = Math.max(sum, max);
        }
        return sum;
    }
}