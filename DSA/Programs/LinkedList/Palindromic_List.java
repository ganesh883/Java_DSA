package LinkedList;

public class Palindromic_List {
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
            public int lPalin(ListNode A) {

                if(A==null || A.next==null){
                    return 1;
                }

                ListNode slow = A;
                ListNode fast = A;

                while(fast!=null && fast.next!=null){
                    slow=slow.next;
                    fast=fast.next.next;
                }

                ListNode curr = slow;
                ListNode prev = null;
                ListNode next;

                while(curr!=null){
                    next=curr.next;
                    curr.next=prev;
                    prev=curr;
                    curr=next;
                }

                ListNode firsthalf = A;
                ListNode secondhalf = prev;

                while(secondhalf!=null){
                    if(firsthalf.val!=secondhalf.val){
                        return 0;
                    }
                    firsthalf=firsthalf.next;
                    secondhalf=secondhalf.next;
                }
                return 1;
            }
        }

    }
}
