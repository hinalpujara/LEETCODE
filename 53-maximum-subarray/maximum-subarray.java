class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0], max = 0 ;
        for(int i = 0; i < nums.length; i++)
        {
          max = max + nums[i];
          if(sum<max)
          {
            sum = max;

          }
          if(max<0){
            max = 0;
          }
        }
        return sum;
    }
}