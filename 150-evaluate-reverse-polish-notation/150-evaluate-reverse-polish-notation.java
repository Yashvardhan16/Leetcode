class Solution {
    public int evalRPN(String[] a) {
        Stack<Integer> st = new Stack<>();
        int n = a.length;
        for(String curr:a){
            if(curr.equals("+")){
           st.push(st.pop() + st.pop());
            }
           else  if(curr.equals("-")){
               st.push(-st.pop()+st.pop());
            }
            else  if(curr.equals("*")){
           st.push(st.pop() * st.pop());
            }
             else  if(curr.equals("/")){
                 int n1 =st.pop();
                 int n2 = st.pop();
           st.push(n2/n1);
            }
        else {
				st.push(Integer.parseInt(curr));
			}
        }
        return st.pop();
  }
}