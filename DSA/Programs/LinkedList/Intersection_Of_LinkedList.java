package LinkedList;

public class Intersection_Of_LinkedList {
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
            public ListNode getIntersectionNode(ListNode A, ListNode B) {

                ListNode ptrA = A;
                ListNode ptrB = B;

                while(ptrA!=ptrB){
                    ptrA = (ptrA==null) ? B : ptrA.next;
                    ptrB = (ptrB==null) ? A : ptrB.next;
                }

                return ptrA;

            }
        }
    }
}
