class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        return helper(s).equals(helper(t));
        
    }
    public String helper(String s){
         StringBuilder sb = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (c != '#')
                sb.append(c);
            else if (sb.length()!=0)
                sb.deleteCharAt(sb.length()-1);
        }
         return sb.toString();
    }
}