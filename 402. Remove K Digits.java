class Solution {
    public String removeKdigits(String num, int k) {
        int digits = num.length() - k;//required output length
        if (num.length() <= k) return "0";
        //start for removing leading zeroes
        int top = -1, start = 0;
        char[] st = num.toCharArray();
        for (int i = 0; i < st.length; i++) {
            while (top >= 0 && st[top] > st[i] && k > 0) {
                top--;
                k--;
            }
            top++;
            st[top] = st[i];
        }
        while (start <= top && st[start] == '0') start++;
        
        String ans = "";
        for(int i = start; i <digits; i++)
            ans = ans + st[i];
        
        if(ans.equals("")) return "0";
        return ans;
    }
}
