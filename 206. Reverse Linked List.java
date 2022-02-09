//Iteratively
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
           ListNode temp = curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
       return prev;
    }
}

//Recursively

class Solution {
    public ListNode reverseList(ListNode head) {
      if(head==null||head.next==null)return head;
        
      ListNode next = head.next;
    head.next = null;

    ListNode root = reverseList(next);
    next.next = head;
    return root;

    }
}
