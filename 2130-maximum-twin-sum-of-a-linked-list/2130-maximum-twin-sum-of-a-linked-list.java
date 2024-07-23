/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        if (head == null)
            return -1;

        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = reverse(slow);
        int answer = 0;
        while (slow != null) {
            int sum = head.val + slow.val;
            answer = Math.max(answer, sum);
            slow = slow.next;
            head = head.next;
        }

        return answer;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode tmp = head;
        while (tmp != null) {
            cur = tmp.next;
            tmp.next = prev;
            prev = tmp;
            tmp = cur;
        }

        return prev;
    }
}