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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null ) return l2;
        if(l2==null) return l1;
        ListNode head = new ListNode(0);
        ListNode cur = head;
        int rem = 0 , sol = 0 ;
        while(l1!=null || l2!=null || rem>0)
        {
            if(l1!=null){
                sol+=l1.val;
                l1=l1.next;
            }
            
            if(l2!=null){
                sol+=l2.val;
                l2=l2.next;
            }
            sol+=rem;
            rem = 0;
            if(sol>9){
              sol=sol%10;
                rem =1;
            }
            cur.next= new ListNode(sol);
            sol= 0;
            cur= cur.next;
        }

        return head.next;     
    }
}