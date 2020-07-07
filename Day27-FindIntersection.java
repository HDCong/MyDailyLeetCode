/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        Stack<ListNode> stackA = new Stack<ListNode> ();
        Stack<ListNode> stackB = new Stack<ListNode> ();
        ListNode temp = headA;
        while(temp!=null)
        {
            stackA.push(temp);
            temp= temp.next;
        }
        temp = headB;
        while(temp!=null)
        {
            stackB.push(temp);
            temp= temp.next;
        }
        ListNode res = null;
        if(stackA.empty()|| stackB.empty()) return res;
        while(!stackA.empty() && !stackB.empty() &&stackA.peek() == stackB.peek() ){
            res = stackA.pop();
            stackB.pop();
        }
        return res;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA  =0 , lenB= 0 ;
     // Calculate length of 2 listnode and storage tail of 2 list
        ListNode tailA=null, tailB=null, cur= headA;
        while(cur!=null){
            ++lenA;
            tailA=cur;
            cur=cur.next;
        }
        cur = headB;
        while(cur!=null){
            ++lenB;
            tailB=cur;
            cur=cur.next;
        }
        // check if 2 tail if diferrent each other
        // if(tailA!=tailB) return null;
        // Modify 2 node have same length
        int dif= lenA- lenB;
        while(dif!=0){
            if(dif>0){
                headA=headA.next;
                --dif;
            }
            else{
                headB=headB.next;
                ++dif;
            }
        }
        
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
}