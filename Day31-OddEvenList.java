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
    public ListNode oddEvenList(ListNode head) {
        // 0 , 1, 2 nodes 
        if(head==null || head.next==null || head.next.next==null ) return head;
        ListNode odd=head, firstEven=head.next, even = head.next;
        while(even!=null&&even.next!=null)
        {
            // if(even==null) break;
            odd.next=even.next;
            // if(odd.next==null) break;
            odd = odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next= firstEven;
        return head;
    }
}