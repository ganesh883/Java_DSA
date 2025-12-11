package LinkedList;

import java.util.List;

public class Check_Cyclic_For_Linked_List {
    public static void main(String[] args) {

        class Solution {
            public boolean CheckCycle(ListNode A) {

                ListNode slow = A;
                ListNode fast = A;
                boolean isCycle = false;

                while(fast.next!=null && fast.next.next!=null){
                    slow=slow.next;
                    fast=fast.next;
                    if(slow==fast){
                        isCycle=true;
                        break;
                    }
                }
                return isCycle;
            }
        }
    }
}

