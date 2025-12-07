package LinkedList;

public class Remove_Nth_Node_From_List_End {
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
            public ListNode removeNthFromEnd(ListNode A, int B) {

                int len = 0;

                ListNode temp = A;
                ListNode temp1 = A;


                while(temp.next!=null){
                    len++;
                    temp=temp.next;
                }

                if(B>len){
                    return A.next;
                }

                int count = len-B;

                for(int i=0;i<count;i++){
                    temp1=temp1.next;
                }
                temp1.next=temp1.next.next;

                return A;

            }
        }

    }
}
