class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        for(int num : nums){
            int complement = target - num;
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(num, i);
            i++;
        }
        return new int[] {};
    }
}
