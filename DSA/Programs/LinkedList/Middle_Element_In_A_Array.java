package LinkedList;

public class Middle_Element_In_A_Array {
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

                ListNode slow = A;
                ListNode fast = A;

                while(fast!=null && fast.next!=null){
                    slow=slow.next;
                    fast=fast.next.next;
                }

                return slow.val;
            }
        }

    }
}
