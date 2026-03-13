class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(right=0; right<s.length();right++){
            char c = s.charAt(right);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            count = Math.max(count, right - left + 1);;
        }
        return count;
    }
}