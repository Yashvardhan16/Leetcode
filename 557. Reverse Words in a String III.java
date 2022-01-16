class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String[] ans = sb.toString().split(" ");
        //delete everything from the stringBuilder
        sb.delete(0,sb.length());
        for (int i = ans.length -1 ; i >= 0 ; i--) {
            sb.append(ans[i]).append(" ");
        }
        return sb.toString().trim();
    }
        }
