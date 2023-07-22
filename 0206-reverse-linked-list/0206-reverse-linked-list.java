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
    public ListNode helper(ListNode head){
        if(head.next==null) { 
        return head;
        }
        ListNode newNode = new ListNode();
        
        newNode=reverseList(head.next);
        head.next.next=head;
        return newNode ;
    
    }
    public ListNode reverseList(ListNode head) {
        if(head==null) return head;
        ListNode node=new ListNode();
        node=helper(head);
        head.next=null;
        return node;
    
    }    
}