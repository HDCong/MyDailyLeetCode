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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null) return head;
        ListNode pt1=null, pt2=null, p1=null,p2=null;
        for(ListNode p = head; p!=null;p=p.next){
            if(p.val<x){
                if(pt1!=null){
                   p1.next=p;
                    p1=p1.next;
                }else{
                     pt1= p;
                    p1=pt1;
                }
            }else{
                if(pt2!=null){
                    p2.next=p;
                    p2=p2.next; 
                }else{
                    pt2= p;
                    p2=pt2;
                }
            }
        }
        if(p2!=null)
            p2.next=null;
        if(pt1==null) return pt2;
        else p1.next= pt2;
        return pt1;
    }
    
}