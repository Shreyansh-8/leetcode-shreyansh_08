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
    public static int gcd(ListNode n1,ListNode n2){
        int result = Math.min(n1.val,n2.val);
        while(result>0){
            if(n1.val%result==0 && n2.val%result==0){
                break;
            }
            result--;
        }
        return result;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode after = head.next;
        ListNode before = head;
        while(after!=null){
            ListNode node = new ListNode();
            node.val = gcd(before,after);
            before.next = node;
            node.next=after;
            before= after;
            after = after.next;
        }
        return head;
    }
}