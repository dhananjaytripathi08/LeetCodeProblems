class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();
        while(n != 1 && !hs.contains(n)) {
            hs.add(n);
            n = getNewNumber(n);
        }
        return n == 1;
    }
    public int getNewNumber(int n) {
        int sum = 0;
        while(n > 0) {
            sum = sum + (n % 10) * (n % 10);
            n = n / 10;
        }
        return sum;
    }
}