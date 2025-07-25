/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }

        }
        if(cycle==false){
            return null;
        }
        slow=head;
        ListNode prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        if(prev!=null){
        prev.next=null;
        }
        return slow;
    }
}