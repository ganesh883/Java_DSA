package LinkedList;

public class Remove_Duplicates_From_Sorted_List {
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
            public ListNode deleteDuplicates(ListNode A) {

                ListNode temp = A;

                while(temp!=null && temp.next!=null){
                    if(temp.val==temp.next.val){
                        temp.next=temp.next.next;
                    }
                    else{
                        temp=temp.next;
                    }
                }
                return A;
            }
        }


    }
}
