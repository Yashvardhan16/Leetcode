class Solution {
public boolean canPartition(int[] nums) {

    int sum = 0;
    for(int value:nums)
        sum += value;
    
    if(sum%2 != 0)return false;
    
    HashMap<Integer,Boolean> map = new HashMap<>();
    
    return isPossible(nums,sum/2,0,map);
}

 boolean isPossible(int nums[],int total,int index,HashMap<Integer,Boolean> map){
    if(map.containsKey(total))return map.get(total);
    if(total == 0)return true;
    if(total < 0)return false;
    
    for(int i=index;i<nums.length;i++){
        map.put(total, isPossible(nums,total-nums[i],i+1,map));
        if(map.get(total))return true;
    }
    
    return false;
}
}
