class Solution {
    public ListNode reverseList(ListNode head) {
        return recursive(head);
    }
    public ListNode recursive(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode newhead = recursive(head.next);
        ListNode front = head.next;
        front.next=head;
        head.next = null;
        return newhead;
    }
}