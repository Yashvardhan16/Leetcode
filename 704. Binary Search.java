//Method 1 : Runtime 0 ms using Binary Search.
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}

//Method 2: Runtime 1 ms Without using Binary Search.
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target)
            return i;
        }
        return -1;
    }
}
