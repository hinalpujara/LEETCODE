class Solution {
    public int majorityElement(int[] nums) {
        int num = nums[0];
        int count = 0;
        // for (int i : nums) {
        //     if (count == 0) {
        //         num = i;
        //     }
        //     count += (i == num) ? 1 : -1;
        // }

        for(int i=0;i<nums.length;i++){
            if(count ==0){
                num = nums[i];
            }
            if(nums[i]==num){
                count++;
            }
            else{
                count--;
            }
        }

        return num;
    }
}