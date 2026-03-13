class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                cleaned.append(Character.toLowerCase(ch));
            }
        }
        s = cleaned.toString();
        char[] arr1 = s.toCharArray();
        int left = 0;
        int right = arr1.length -1;
        while(left<right){
            if(arr1[left] != arr1[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}