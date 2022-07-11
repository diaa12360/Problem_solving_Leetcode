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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode t = head;
        while (t != null) {
            list.add(t.val);
            t = t.next;
        }
        int fornt = 0, end = list.size() - 1;
        
        while(fornt < end){
            if(list.get(fornt) != list.get(end))
                return false;
            fornt++;
            end--;
        }
        return true;
    }
}
