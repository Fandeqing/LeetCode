/**
 * Created by wqlin on 17-12-9 23:29.
 */
public class No142 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            if (slow == fast) {
                int step = 0;
                while (fast.next != slow) {
                    fast = fast.next;
                    step += 1;
                }
                fast = head;
                slow = head;
                while (step >= 0) {
                    fast = fast.next;
                    step -= 1;
                }
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            } else {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return null;
    }
}
