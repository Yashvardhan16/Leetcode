class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> st = new Stack();
        int i = 0; 
        
        while(i<a.length){
            if(a[i]>0){
                st.push(a[i]);
            }else{
                while(!st.isEmpty() && st.peek()>0 && Math.abs(a[i])>st.peek()){
                    st.pop();
                }
                if(st.isEmpty() || st.peek()<0){
                    st.push(a[i]);
                }else if(Math.abs(a[i])==st.peek()) st.pop();
            }
            i++;
        }
   int[] ans = new int[st.size()];
        for (int j = st.size() - 1; j >= 0; j--) {
            ans[j] = st.pop();
        }
        return ans;
    }
}