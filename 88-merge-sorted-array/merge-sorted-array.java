class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int[] arr = new int[m+n];
        int i=0 ;
        int j=0;
        for(i=0;i<m;i++)
        {
            nums1[j] = nums1[i];
            j++;
        }
        for(i = 0;i< n;i++)
        {
            nums1[j] = nums2[i];
            j++;
        }
        Arrays.sort(nums1);
    }
}