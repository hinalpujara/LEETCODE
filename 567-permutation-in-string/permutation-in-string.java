class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] windowfreq = new int[26];
        int left = 0;
        int n = s1.length();
        int[] targetfreq = new int[26];
        if (s1.length() > s2.length()) {
            return false;
        }
        for(char ch:s1.toCharArray()){
            targetfreq[ch -'a']++;
        }
        for(int right = 0; right<s2.length(); right++){
            char ch = s2.charAt(right);
            windowfreq[ch-'a']++;
            if(right-left+1>n){
                windowfreq[s2.charAt(left) -'a']--;
                left++; 
            }
            if(right-left+1 == n){
                boolean same = true;
                for(int i = 0; i<26; i++){
                    if(windowfreq[i] != targetfreq[i]){
                        same = false;
                        break;
                    }
                }
                if(same){
                    return true;
                }
                
            }
        }
        return false;
    }
}