class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        int m = nums1.length;
        int n = nums2.length;
        ArrayList<Integer> nums = new ArrayList<Integer>();
        while(i<m && j<n)
        {
            if(nums1[i]<nums2[j])
            {
                i++;
            }
            else if(nums2[j]<nums1[i])
            {
                j++;
            }
            else
            {
                nums.add(nums2[j]);
                i++;
                j++;
            }
        }
        int l = nums.size();
        int[] nums3 = new int[l];
        for(i=0; i<l; i++)
        {
            nums3[i] = nums.get(i);
        }
        return nums3;
    }
}