class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        else{
        int t = x;
        int sum = 0;
        while (t != 0 ) {
         int n=t%10;
         sum=n+sum*10;
         t=t/10;
        }
        if(sum==x)
return true;
else
return false;
    }
}}