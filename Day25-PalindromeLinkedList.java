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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null ) return true; // 1 node        
        if(head.next.next==null) return (head.val==head.next.val); // 2node

        // if(head.next.next.next==null) return head.value==head.next.next.value; // 3node
        ListNode sl = head, fast = head, post =null, pre= null;        
       
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            
            post=sl.next;
            sl.next=pre;
            pre= sl;
            sl=post;
        }
        if(fast.next==null){
            sl=sl.next;
            
        }
        else{
               post=sl.next;
            sl.next=pre;
            pre= sl;
            sl=post;
        }
        while(pre!=null && sl!=null){
            if(pre.val!=sl.val)
                return false;
            pre=pre.next;
            sl=sl.next;
        }
        if(sl==null && pre==null)
            return true;
        return false;
    }
   
}