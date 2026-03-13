class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        double sum = 0;
        double maxsum = 0;
        for(int i = 0; i<k; i++){
            sum = sum + nums[i];
        }
        maxsum = sum;
        for(int right=k; right<nums.length; right++){
                sum = sum + nums[right] - nums[left];
                maxsum = Math.max(maxsum,sum);
                left++;
        }
        return maxsum/k;
    }
}