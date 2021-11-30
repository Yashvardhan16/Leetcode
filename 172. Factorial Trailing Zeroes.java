 class Solution {
    public int trailingZeroes(int n) {
        int rem = 0;
        while (n > 0) {
            n /= 5;
            rem += n;
        }
        return rem;
    }
}
