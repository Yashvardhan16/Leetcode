class Solution {
    public int singleNumber(int[] a) {
  int ans = 0;
    for(int i : a) {
        ans ^= i;
    }
    return ans;
}}
