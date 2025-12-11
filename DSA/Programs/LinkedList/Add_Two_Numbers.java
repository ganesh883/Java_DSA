package LinkedList;

public class Add_Two_Numbers {
    public static void main(String[] args) {
        class ListNode {
            public int val;
            public ListNode next;
            ListNode(int x) { val = x; next = null; }
        }

         class Solution {
            public ListNode addTwoNumbers(ListNode A, ListNode B) {
                ListNode dummy = new ListNode(0);
                ListNode curr = dummy;

                int carry = 0;

                while (A != null || B != null || carry != 0) {
                    int sum = carry;

                    if (A != null) {
                        sum += A.val;
                        A = A.next;
                    }
                    if (B != null) {
                        sum += B.val;
                        B = B.next;
                    }

                    carry = sum / 10;
                    curr.next = new ListNode(sum % 10);
                    curr = curr.next;
                }

                return dummy.next;
            }
        }

    }
}
