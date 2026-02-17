package Queue;

import java.util.Stack;

public class Queue_Using_Stack {
    public static class UserQueue {
        /** Initialize your data structure here. */

        static Stack<Integer> st1 = new Stack<>();
        static Stack<Integer> st2 = new Stack<>();
        UserQueue() {

        }

        /** Push element X to the back of queue. */
        static void push(int X) {
            st1.push(X);

        }

        /** Removes the element from in front of queue and returns that element. */
        static int pop() {
            if(st2.isEmpty()){
                while(st1.size()!=0){
                    st2.push(st1.pop());
                }
            }

            return st2.pop();

        }

        /** Get the front element of the queue. */
        static int peek() {
            if(st2.isEmpty()){
                while(st1.size()!=0){
                    st2.push(st1.pop());
                }
            }

            return st2.peek();

        }

        /** Returns whether the queue is empty. */
        static boolean empty() {

            if(st1.size()==0 && st2.size()==0){
                return true;
            }
            return false;

        }
    }

/**
 * Your UserQueue object will be instantiated and called as such:
 * UserQueue obj = new UserQueue();
 * obj.push(X);
 * int param2 = obj.pop();
 * int param3 = obj.peek();
 * boolean param4 = obj.empty();
 */
}
