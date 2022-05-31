class Solution {
   public int minimumSize(int[] A, int k) {
        int left = 0, right = Integer.MAX_VALUE;
        while (left + 1 < right) {
            int mid = (left + right) / 2;
            int count = 0;
            for (int a : A)
                count += (a - 1) / mid;
            if (count <= k)
                right = mid ;
            else
                left = mid;
        }
        return right;
    }
}