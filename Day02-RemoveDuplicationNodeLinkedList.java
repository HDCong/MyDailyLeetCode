class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        
        ListNode prev = head;
        ListNode cur = head.next;
        while(cur != null) {
            if(cur.val == prev.val)
                cur = cur.next;
            else {
                prev.next = cur;
                prev = cur;
                cur = cur.next;
            }
        }
        
        prev.next = null;
        return head;

    }
}