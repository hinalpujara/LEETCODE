class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = m;
        for(int i = 0; i<n; i++){
            nums1[x+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}