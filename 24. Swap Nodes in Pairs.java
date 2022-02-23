//Space Complexiy O(1)

class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        ListNode current = head;
        
        while(current!=null && current.next!=null){
            prev.next=current.next;
            current.next=current.next.next;
            prev.next.next=current;
            current=current.next;
            prev = prev.next.next;
        }
        return dummy.next;
    }
}

//Space Complexity O(n) Recursive

class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if(head==null||head.next==null) return head;
        
        ListNode n = head.next;
        head.next = swapPairs( head.next.next);
        n.next=head;
        return n;
    }}
