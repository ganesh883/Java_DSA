package LinkedList;

public class Merge_Two_Linked_List {
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
            public ListNode mergeTwoLists(ListNode A, ListNode B) {

                if(A==null){
                    return B;
                }

                if(B==null){
                    return A;
                }

                ListNode h = null;
                ListNode t = null;

                if(A.val < B.val){
                    h=A;
                    t=A;
                    A=A.next;
                }
                else{
                    h=B;
                    t=B;
                    B=B.next;
                }

                while(A!=null && B!=null){
                    if(A.val < B.val){
                        t.next=A;
                        A=A.next;
                        t=t.next;
                    }
                    else{
                        t.next = B;
                        B=B.next;
                        t=t.next;
                    }
                }


                if(A!=null){
                    t.next = A;
                }

                if(B!=null){
                    t.next = B;
                }

                return h;
            }
        }

    }
}
