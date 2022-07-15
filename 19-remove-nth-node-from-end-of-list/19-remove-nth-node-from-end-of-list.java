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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        ListNode x = head;
        for(int i = n; i > 0; i--)
            x = x.next;
        if(x == null ){
            return head.next;
        }
        ListNode y = head;
        while(x.next != null){
            y = y.next;
            x = x.next;
        }
        
        y.next = y.next.next;
        return head;
    }
}