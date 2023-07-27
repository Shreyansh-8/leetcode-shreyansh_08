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
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode n = slow.next;
        slow.next=null;
        ListNode n1= null;
        ListNode n2=null;
        while(n!=null){
            n2=n.next;
            n.next=n1;
            n1 = n;
            n=n2;
        }

        while(n1!=null){
            ListNode a = head.next;
            ListNode b = n1.next;
            head.next=n1;
            n1.next=a;
            head = a;
            n1 = b;
        }
    }
}