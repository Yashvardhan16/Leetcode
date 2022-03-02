class Solution {
    public String breakPalindrome(String palindrome) {
        int n = palindrome.length();
        if(n<=1) return "";
        char[] c = palindrome.toCharArray();
        for(int i=0;i<n/2;i++){
            if(c[i]-'a'!=0){
                c[i] ='a';
                return new String(c);
            }
        }
        c[c.length-1] = 'b';
        return new String(c);
    }
}
