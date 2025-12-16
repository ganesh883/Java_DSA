//package LinkedList;
//
//public class Copy_List {
//    public static void main(String[] args) {
//
//         class Solution {
//            public RandomListNode copyRandomList(RandomListNode head) {
//                if (head == null) return null;
//
//                // Step 1: Insert copy nodes after original nodes
//                RandomListNode curr = head;
//                while (curr != null) {
//                    RandomListNode copy = new RandomListNode(curr.label);
//                    copy.next = curr.next;
//                    curr.next = copy;
//                    curr = copy.next;
//                }
//
//                // Step 2: Assign random pointers
//                curr = head;
//                while (curr != null) {
//                    if (curr.random != null) {
//                        curr.next.random = curr.random.next;
//                    }
//                    curr = curr.next.next;
//                }
//
//                // Step 3: Separate original and copied list
//                curr = head;
//                RandomListNode newHead = head.next;
//
//                while (curr != null) {
//                    RandomListNode copy = curr.next;
//                    curr.next = copy.next;
//                    if (copy.next != null) {
//                        copy.next = copy.next.next;
//                    }
//                    curr = curr.next;
//                }
//
//                return newHead;
//            }
//        }
//
//    }
//}
