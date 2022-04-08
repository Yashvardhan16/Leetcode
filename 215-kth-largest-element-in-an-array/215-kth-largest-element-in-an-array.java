class Solution {
    public int findKthLargest(int[] nums, int k) {
      PriorityQueue<Integer> maxheap = new PriorityQueue<Integer>();
        int j=0;
//         for(int i=0;i<nums.length;i++){
//             minheap.add(nums[i]);
            
//         }
//         for(int i=nums.length-1-k;i>=0;i--){
//             minheap.poll();
//         }
        for(int i:nums){
            maxheap.add(i);
            j++;
            if(j>k) maxheap.poll();
        }
        return maxheap.peek();
    }
}