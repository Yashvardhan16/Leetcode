/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode copy = head;
        Stack<Integer> st = new Stack();
        while(copy!=null){
            st.push(copy.val);
            copy = copy.next;
             } 
            while(!st.isEmpty()){
                if(st.pop()!=head.val){
                return false;
            }
            head = head.next;
    }
        return true;
    }
}