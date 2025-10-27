class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> freq = new HashMap<>();
        for(char i : s.toCharArray()){
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        for(char i : t.toCharArray()){
            freq.put(i, freq.getOrDefault(i,0)- 1);
        }
        for(int count : freq.values()){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}
