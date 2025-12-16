package LinkedList;

public class longestPalindromicList {
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
            public int solve(ListNode A) {
                if (A == null || A.next == null) return A == null ? 0 : 1;
                ListNode slow = A, fast = A;
                while (fast.next != null && fast.next.next != null) {
                    slow = slow.next;
                    fast = fast.next.next;
                }
                ListNode secondHalf = slow.next;
                slow.next = null;
                ListNode firstHalf = reverseList(A);
                // For odd length, move secondHalf one step forward
                if (fast.next == null) {
                    secondHalf = secondHalf.next;
                }
                return countPalindrome(firstHalf, secondHalf);
            }
            private ListNode reverseList(ListNode head) {
                ListNode prev = null;
                ListNode current = head;
                while (current != null) {
                    ListNode nextTemp = current.next;
                    current.next = prev;
                    prev = current;
                    current = nextTemp;
                }
                return prev;
            }
            private int countPalindrome(ListNode firstHalf, ListNode secondHalf) {
                int count = 0;
                while (firstHalf != null && secondHalf != null) {
                    if (firstHalf.val == secondHalf.val) {
                        count += 2;
                    } else {
                        break;
                    }
                    firstHalf = firstHalf.next;
                    secondHalf = secondHalf.next;
                }
                // If the list length is odd, add 1 for the middle element
                if (firstHalf == null && secondHalf == null) {
                    count++;
                }
                return count;
            }
        }

    }
}
