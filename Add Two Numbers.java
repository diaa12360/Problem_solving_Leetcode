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
import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//             String s = "";
        StringBuilder s = new StringBuilder();
        StringBuilder s1 = new StringBuilder();
//            StringBuilder s1 = new StringBuilder();
        while (l1 != null) {
            s.insert(0, l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            s1.insert(0, l2.val);
            l2 = l2.next;
        }
        String ans = (new BigInteger(String.valueOf(s)).add(new BigInteger(s1.toString()))) + "";
        ListNode sol = new ListNode(Integer.parseInt(ans.charAt(ans.length()-1) + ""));
        ListNode x = sol;
        for (int i = ans.length()-2; i >= 0; i--) {
            x.next = new ListNode(Integer.parseInt(ans.charAt(i) + ""));
            x = x.next;
        }
        return sol;

    }
}
