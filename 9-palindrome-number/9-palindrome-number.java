class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        Stack<Integer> st = new Stack();
              int temp = x;
        while(temp>0){
            st.push(temp%10);
            temp/=10;
        }
        temp = x;
        while(temp>0){
            if(temp%10!=st.pop())
                return false;
            temp/=10;
        }
        return true;
    }
}