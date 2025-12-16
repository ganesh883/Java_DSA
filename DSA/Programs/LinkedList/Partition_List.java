package LinkedList;

public class Partition_List {
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
            public ListNode partition(ListNode A, int B) {

                ListNode lessDummy = new ListNode(0);
                ListNode greaterDummy = new ListNode(0);

                ListNode lessTail=lessDummy;
                ListNode greaterTail=greaterDummy;

                while(A!=null){
                    if(A.val<B){
                        lessTail.next=A;
                        lessTail=lessTail.next;
                    }
                    else{
                        greaterTail.next=A;
                        greaterTail=greaterTail.next;
                    }
                    A=A.next;
                }
                lessTail.next=greaterDummy.next;
                greaterTail.next=null;

                return lessDummy.next;
            }
        }

    }
}
