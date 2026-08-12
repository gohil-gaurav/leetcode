class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int ans = 0;
        int num = x;
        while(x > 0){
            int res = x%10;
            ans = ans*10 + res;
            x /= 10;
        }
        return ans == num; 
    }
}