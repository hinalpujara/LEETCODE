class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length == 0){
            return "";
        }
        String solution = strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(solution)!=0){
                solution = solution.substring(0,solution.length()-1);
            }
            if(solution == ""){
                return "";
            }
            
        }
        return solution;
    }
}