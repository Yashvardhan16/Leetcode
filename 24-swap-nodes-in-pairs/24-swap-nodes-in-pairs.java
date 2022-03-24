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
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        ListNode curr =head;
        while(curr!=null && curr.next!=null){
            prev.next = curr.next;
            //-1 points to 2
           curr.next = curr.next.next;
            //1 points to 3
            prev.next.next = curr;
            // -1 then 2 then finally 1
            curr = curr.next;
            //curr pointing to 2 now points to 3
            prev = prev.next.next;
            // prev pointing from -1 to 2 now points 1 points to 3
        }
        return dummy.next;
    }
}