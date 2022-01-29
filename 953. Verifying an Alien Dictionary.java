class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] alphabet = new int[26];
        for(int i=0;i<order.length();i++){
            alphabet[order.charAt(i) -'a']=i;
        }
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
      int min = Math.min(words[i].length(),words[j].length());
                for(int k=0;k<min;k++){
                    char ichar = words[i].charAt(k);
                    char jchar = words[j].charAt(k);
                    if(alphabet[ichar-'a']<alphabet[jchar-'a']){
                        break;
                    }
                   else  if(alphabet[jchar-'a']<alphabet[ichar-'a']){
                        return false;
                    }
         else if(k==min-1 && words[i].length()>words[j].length()){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
