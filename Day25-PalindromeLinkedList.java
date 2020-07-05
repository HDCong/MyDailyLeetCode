class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode pre = null;
        ListNode cur = head;
        ListNode post = null;
        ListNode fast = head;
        boolean odd = true;  //odd or even
        //search middle of linked list
        while(fast.next!=null){
            fast = fast.next;
            if(fast.next!=null){
                fast = fast.next;
            }else{
                odd = false;
                break;
            }
            // reverse first half linked list
            post = cur.next;
            cur.next = pre;
            pre = cur;
            cur = post;
        }
        if(cur == head){// means length of list is 2
            return cur.val == cur.next.val;
        }
        if(odd){ 
            cur = cur.next;
        }else{// reverse last node of first half list where odd is false
            post = cur.next;
            cur.next = pre;
            pre = cur;
            cur = post;
        }
        while(pre!=null){
            if(pre.val != cur.val){
                return false;
            }
            pre = pre.next;
            cur = cur.next;
        }
        return true;
    }
}