class Solution {
    public int deleteAndEarn(int[] nums) {
        int add=0;
        int drop=0;
        int count[] = new int[10001];
        for(int val:nums){
            count[val]++;
        }
        for(int j=0;j<10001;j++){
            int notadd = drop +count[j]*j;
            int notdrop = Math.max(add,drop);
            
             add = notadd;
             drop =notdrop;
        }
        return Math.max(add,drop);
    }
}
