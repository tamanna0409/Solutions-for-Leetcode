class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode c = new ListNode(0);
            ListNode x = c;
    
            while (list1 != null && list2 != null){
                if(list1.val < list2.val){
                    c.next = list1;
                    list1 = list1.next;
                }
                else{
                    c.next = list2;
                    list2 = list2.next;
                }
                c = c.next;
            }
            if(list1 != null){
                c.next = list1;
            }
            else{
                c.next = list2;
            }
            return x.next;
        }
    }
    