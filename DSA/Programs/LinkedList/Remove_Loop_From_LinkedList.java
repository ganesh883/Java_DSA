package LinkedList;

public class Remove_Loop_From_LinkedList {
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
            public ListNode solve(ListNode A) {

                ListNode slow = A;
                ListNode fast = A;

                while(fast.next!=null && fast.next.next!=null){
                    slow=slow.next;
                    fast=fast.next.next;
                    if(slow==fast){
                        break;
                    }
                }

                ListNode p1 = A;
                ListNode p2 = fast;

                while(p1!=p2){
                    p1=p1.next;
                    p2=p2.next;
                }

                ListNode start = p1;
                ListNode end = p1;

                while(end.next!=start){
                    end=end.next;
                }
                end.next= null;

                return A;
            }
        }

    }
}
