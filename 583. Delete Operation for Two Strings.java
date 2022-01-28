class Solution {
    public int minDistance(String s1, String s2) {
        int[][] count = new int[s1.length() + 1][s2.length() + 1];
        for(int i=1; i<=s1.length(); i++){
            for(int j=1; j<=s2.length(); j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    count[i][j] = count[i-1][j-1] + 1 ;
                }
                else{
                    count[i][j] = Math.max(count[i-1][j],count[i][j-1]);
                }
            }
        }
        return s1.length() + s2.length() - 2 * count[s1.length()][s2.length()]; 
    }
}
