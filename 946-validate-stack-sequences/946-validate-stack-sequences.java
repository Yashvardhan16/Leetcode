class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length!=popped.length) return false;
         Stack<Integer> st = new Stack();
        int i=0;
        for(int val:pushed){
            st.push(val);
            while(!st.isEmpty() && st.peek()==popped[i]){
                st.pop();
                i++;
            }
        }
        return st.isEmpty();
    }
}