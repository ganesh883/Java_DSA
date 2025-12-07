package LinkedList;

public class Reverse_Linked_List_11 {
    public static void main(String[] args) {
        /**
         * Definition for singly-linked list.
         * class ListNode {
         *     public int val;
         *     public ListNode next;
         *     ListNode(int x) { val = x; next = null; }
         * }
         */
         class Solution {
            public ListNode reverseBetween(ListNode A, int B, int C) {

                if (A == null || B == C) return A;

                ListNode head = A;  // keep original head safe
                ListNode temp = A;
                ListNode beforeB = null;
                int i = 1;

                // Step 1: Move temp to the B-th node
                while (i < B) {
                    beforeB = temp;
                    temp = temp.next;
                    i++;
                }

                // Now temp is at B
                ListNode prev = null;
                ListNode curr = temp;
                ListNode next = null;

                // Step 2: Reverse from B to C
                while (i <= C) {
                    next = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = next;
                    i++;
                }

                // Step 3: Connect the reversed part

                // beforeB -> prev (new first node of reversed part)
                if (beforeB != null) {
                    beforeB.next = prev;
                } else {
                    head = prev;  // if B == 1, new head becomes prev
                }

                // temp was at B, now becomes last of reversed part
                temp.next = curr;

                return head;
            }
        }

    }
}
