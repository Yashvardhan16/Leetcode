class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        for(String s1 : s.split(" ")){
            if(!s1.isEmpty())
            st.push(s1);
        }
        StringBuilder sb = new StringBuilder();
        
            while(!st.isEmpty()){
                sb.append(st.pop());
                sb.append(" ");
            }
        return sb.toString().trim();
    }
}