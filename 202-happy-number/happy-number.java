class Solution {
    public static int numSum(int n){
        int sum = 0;
        int digit;
        while(n > 0){
            digit = n % 10;
            sum += (digit*digit);
            n = n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
       int slow = n;
       int fast = n;
       do{
        slow = numSum(slow);
        fast = numSum(numSum(fast));
       }while(slow != fast);
       if(slow == 1){
        return true;
       }

       return false;

        
        
    }
}