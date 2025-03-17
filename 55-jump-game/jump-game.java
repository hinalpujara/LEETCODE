class Solution {
    public boolean canJump(int[] nums) {
        int i = 0;
        int n = nums.length;
        int pos = 0;
        for(i=0;i<n;i++){
            if(i>pos){
                return false;
            }
            if(pos < i + nums[i]){
                pos = i + nums[i]; 
            }
        }
        return true;
    }
}