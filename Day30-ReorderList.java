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
    public void reorderList(ListNode head) {
        if( head==null || head.next==null || head.next.next==null) return ; // 0,1,2 nodes
        // find middle node
        ListNode sec=null, cur=head, f=head,f2= null;
        while(f.next!=null && f.next.next!=null){
            f=f.next.next;
            cur=cur.next;
        }
        sec = reverse(cur.next);
        cur=head;
        while(sec!=null){
            f=cur.next;
            cur.next=sec;
            f2= sec.next;
            sec.next=f;
            cur=f;
            sec=f2;
        }
        cur.next=null;
    }
    private ListNode reverse(ListNode head){
        if(head.next==null) return head;
        ListNode pre= null, cur = head, pos =null;
        while(cur!=null){
            pos= cur.next;
            cur.next= pre;
            pre=cur;
            cur=pos;
        }
        return pre;
    }
}