class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int minlen = Math.min(word1.length(), word2.length());
        for(int i = 0; i<minlen; i++){
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(i));
        }
        if(word1.length() < word2.length()){
            merged.append(word2.substring(minlen));
        }
        else if(word2.length() < word1.length()){
            merged.append(word1.substring(minlen));
        }
        return merged.toString();
    }
}