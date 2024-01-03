class Solution {
    public boolean isPalindrome(int x) {
        int rem,sum,num;
        num = x;
        sum = 0;
        while(num>0){
            rem = num % 10;
            sum = (sum * 10) + rem;
            num = num / 10;
        }
        if(x<0){
            return false;
        }
        else if(x == sum){
            return true;
        }
        else{
            return false;
        }

    }
}