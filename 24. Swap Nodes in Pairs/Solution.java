public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode d = new ListNode(0,head);
        ListNode p = d, cur = head;

        while(cur!=null && cur.next!=null){
            ListNode n = cur.next.next;
            ListNode sec = cur.next;

            sec.next = cur;
            cur.next = n;
            p.next = sec;
            p = cur;
            cur = n;
        }
        return d.next;
    }
}