package LinkedList;

public class K_Reverse_Linked_List {
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
            public ListNode reverseList(ListNode A, int B) {

                if(B==0 || A==null){
                    return A;
                }

                ListNode temp = A;

                ListNode curr=A;
                ListNode prev=null;
                ListNode next=null;
                int count =0;

                while(curr!=null && count<B){
                    next = curr.next;
                    curr.next=prev;
                    prev=curr;
                    curr=next;
                    count++;
                }

                if(next!=null){
                    A.next = reverseList(curr,B);
                }

                return prev;


            }
        }

    }
}
