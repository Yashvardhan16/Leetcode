class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList();
        for(int i=1;i<=9;i++){
            helper(i,n,ans);
        }
        return ans;
    }
    void helper(int curr,int n , List<Integer> ans){
        if(curr>n) return;
        else{
            ans.add(curr);
        
        for(int i=0;i<10;i++){
            if(10*curr+i>n) return;
            helper(10*curr+i,n,ans);
        }
        }
    }
}