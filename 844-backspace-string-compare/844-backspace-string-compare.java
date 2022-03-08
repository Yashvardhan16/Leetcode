class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        return helper(s).equals(helper(t));
        
    }
    public String helper(String s){
         Stack<Character> ans = new Stack();
        for (char c: s.toCharArray()) {
            if (c != '#')
                ans.push(c);
            else if (!ans.empty())
                ans.pop();
        }
         return String.valueOf(ans);
    }
}