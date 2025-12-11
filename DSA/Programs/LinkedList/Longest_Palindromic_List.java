package LinkedList;

public class Longest_Palindromic_List {
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
            public int solve(ListNode A) {
                int len=1;
                ListNode prev=null,cur=A,nex=A.next;
//reverse each node
                while(cur.next!=null){
                    nex=cur.next;
                    cur.next=prev;
                    prev=cur;
                    cur=nex;
// check left of it and right of it
// this checking even length list
                    len=Math.max(len,check(prev,cur));
// this is odd length list
                    len=Math.max(len,check(prev,cur.next)+1);
                }
                return len;
            }
            // checks whether left and right are same
// if same returns its length
            public int check(ListNode a, ListNode b){
                int ans=0;
                while(a!=null && b!=null){
                    if(a.val== b.val) {ans+=2; a=a.next; b=b.next;}
                    else return ans;
                }
                return ans;
            }
        }

    }
}
