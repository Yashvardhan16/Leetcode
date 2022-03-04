class Solution {
    public int scoreOfParentheses(String s) {
        int count =0;
       Stack<Integer> stack = new Stack<>();
        int n = s.length();
        
       for(char c: s.toCharArray()){
            if(c=='('){
               stack.push(count);
                count=0;
            }
            else if(c==')'){
             count =  stack.pop() + Math.max(count*2,1);    
        }
        }
        return count;
    }
}