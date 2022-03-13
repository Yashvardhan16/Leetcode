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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null||head.next==null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode it = dummy;
        ListNode prev =null;
        for(int i=0;i<left;i++){
            prev = it;
            it = it.next;
        }
        ListNode prevf = prev;
        ListNode itr = it;
        
        for(int i=left;i<=right;i++){
            ListNode forward = itr.next;
            itr.next=prevf;
            prevf = itr;
            itr = forward;
        }
        prev.next = prevf;
        it.next=itr;
        return dummy.next;
    }
}