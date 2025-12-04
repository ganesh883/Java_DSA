package LinkedList;

public class Insert_In_Linked_List {
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
            public ListNode solve(ListNode A, int B, int C) {


                ListNode n1 = new ListNode(B);

                if(A==null){
                    return n1;
                }

                ListNode temp = A;

                if(C==0){
                    n1.next=A;
                    return n1;
                }

                int count =0;

                while(count < C-1){
                    if(A.next!=null){
                        A=A.next;
                        count++;
                    }
                    else{
                        A.next = n1;
                        return temp;
                    }
                }

                n1.next=A.next;
                A.next=n1;

                return temp;
            }
        }

    }
}
