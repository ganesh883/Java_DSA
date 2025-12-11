package LinkedList;

public class Sort_List {
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
            public ListNode sortList(ListNode A) {

                if(A == null || A.next==null){
                    return A;
                }

                ListNode mid = findMiddle(A);
                ListNode h2 = mid.next;
                mid.next=null;

                ListNode t1 = sortList(A);
                ListNode t2 = sortList(h2);


                return mergesort(t1,t2);

            }

            public static ListNode findMiddle(ListNode A){
                ListNode slow = A;
                ListNode fast = A;

                while(fast.next!=null && fast.next.next!=null){
                    slow=slow.next;
                    fast=fast.next.next;
                }
                return slow;
            }

            public static ListNode mergesort(ListNode A, ListNode B){
                if(A==null){
                    return B;
                }

                if(B==null){
                    return A;
                }

                ListNode h = null;
                ListNode t = null;

                if(A.val<B.val){
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
                    if(A.val<B.val){
                        t.next=A;
                        A=A.next;
                        t=t.next;
                    }
                    else{
                        t.next=B;
                        B=B.next;
                        t=t.next;
                    }
                }

                if(A!=null){
                    t.next=A;
                }

                else if(B!=null){
                    t.next=B;
                }

                return h;
            }
        }


    }
}
