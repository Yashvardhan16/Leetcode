class Solution {
    public ListNode middleNode(ListNode head) {
        if(head==null) return null;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            head = head.next;
            fast = fast.next.next;
        }
        return head;
    }
}
