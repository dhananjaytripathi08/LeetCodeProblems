class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int num = x;
        int remainder = 0;
        int digitSum = 0;
        while(num != 0) {
            remainder = num % 10;
            digitSum = digitSum + remainder;
            num = num / 10;
        }
        if(x % digitSum == 0) {
            return digitSum;
        }
        return -1;
    }
}