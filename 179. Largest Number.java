class Solution {
    public String largestNumber(int[] nums) {   
        if(nums.length==0)
            return "";
        String[] ans=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=Integer.toString(nums[i]);
        }
        Arrays.sort(ans,(a,b) -> (b+a).compareTo(a+b));
        StringBuilder res=new StringBuilder();
        if(ans[0].equals("0"))
            return "0";
        for(int i=0;i<ans.length;i++)
        {
            res.append(ans[i]);
        }
        return res.toString();
    }
}
