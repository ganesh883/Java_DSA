package LinkedList;

public class Reverse_A_Linked_List {
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
            public ListNode reverseList(ListNode A) {

                ListNode curr = A;
                ListNode prev = null;
                ListNode next;

                while(curr!=null){
                    next = curr.next;
                    curr.next = prev;
                    prev=curr;
                    curr = next;
                }
                A=prev;
                return A;



            }
        }

    }
}
