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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m==n) return head;
        int i =1;
        ListNode cur =head, post, pre=null,sec=null,third;
        while(cur!=null && i < m){
            sec=cur;
            cur=cur.next;
            ++i;
        }
        third = cur;
        while(i<=n){
            post=cur.next;
            cur.next=pre;
            pre=cur;
            cur=post;
            ++i;
        }
        third.next=cur;
        if(sec!=null) sec.next=pre;
        else head =pre;
        return head;
        
    }
}