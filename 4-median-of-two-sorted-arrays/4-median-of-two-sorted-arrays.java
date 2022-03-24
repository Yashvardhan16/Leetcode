class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                ans[k] = nums1[i];
                i++;k++;
            }else {
                ans[k] = nums2[j];
                j++;k++;
            }
        }
        
        while(i<nums1.length){
            ans[k] = nums1[i];
            i++;k++;
        }
        while(j<nums2.length){
            ans[k] = nums2[j];
            j++;k++;
        }
        double median = 0;
        int mid = ans.length/2;
        if(ans.length%2==1){
            median = ans[mid];
        }else{
            median = (ans[mid]+ans[mid-1])/2.0;
        }
        return median;
    }
}