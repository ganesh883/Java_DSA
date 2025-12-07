package LinkedList;

public class Delete_In_LinkedList {
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
            public ListNode solve(ListNode A, int B) {

                if(B==0){
                    return A.next;
                }

                ListNode temp = A;

                for(int i=0;i<B-1;i++){
                    A=A.next;
                }
                A.next=A.next.next;

                return  temp;
            }
        }

    }
}
