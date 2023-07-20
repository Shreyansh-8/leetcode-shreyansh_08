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
    public ListNode swapPairs(ListNode head) {
        ListNode n1 = new ListNode();
        ListNode n2 = new ListNode();
        if(head==null || head.next==null){
            return head;
        }
        n1=head.next;
        n2=n1.next;
        
        n1.next=head;
        head.next=swapPairs(n2);
        
        return n1;
        
        
        
    }
}