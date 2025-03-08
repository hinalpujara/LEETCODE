class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int nums1[] = new int[n];
         k = k % n;
        
        for(int i = 0; i<k; i++){
            nums1[i] = nums[n-k+i];
        }
        for(int i = 0; i<n-k; i++){
            nums1[k+i] = nums[i];
        }
        for(int i = 0; i<n; i++){
            nums [i]= nums1[i];
        }
    }
}