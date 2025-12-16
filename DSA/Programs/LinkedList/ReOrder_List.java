package LinkedList;

public class ReOrder_List {
    public static void main(String[] args) {
        class ListNode {
            int val;
            ListNode next;
            ListNode(int x) { val = x; next = null; }
        }
         class Solution {
            public ListNode reorderList(ListNode head) {
                if (head == null || head.next == null) return head;
                // Step 1: Find middle
                ListNode slow = head, fast = head;
                while (fast.next != null && fast.next.next != null) {
                    slow = slow.next;
                    fast = fast.next.next;
                }
                // Step 2: Reverse second half
                ListNode second = reverse(slow.next);
                slow.next = null; // Cut the list into two halves
                // Step 3: Merge both halves
                ListNode first = head;
                while (second != null) {
                    ListNode temp1 = first.next;
                    ListNode temp2 = second.next;
                    first.next = second;
                    second.next = temp1;
                    first = temp1;
                    second = temp2;
                }
                return head;
            }
            private ListNode reverse(ListNode head) {
                ListNode prev = null, next = null;
                while (head != null) {
                    next = head.next;
                    head.next = prev;
                    prev = head;
                    head = next;
                }
                return prev;
            }
        }

    }
}
