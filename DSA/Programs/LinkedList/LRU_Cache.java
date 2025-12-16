package LinkedList;

import java.util.HashMap;

public class LRU_Cache {
    public static void main(String[] args) {
         class Solution {

            HashMap<Integer,Node> hmap = new HashMap<>();

            Node head,tail;
            int capacity;


            class Node{
                int key;
                int value;
                Node prev;
                Node next;
                Node(int x,int y){
                    key = x;
                    value = y;
                    prev = null;
                    next = null;
                }
            }


            public Solution(int capacity) {
                this.capacity=capacity;
                head=new Node(0,0);
                tail=new Node(0,0);
                head.next=tail;
                tail.prev=head;
            }

            public int get(int key) {
                if(hmap.containsKey(key)){
                    Node node = hmap.get(key);
                    remove(node);
                    addToBack(node);
                    return node.value;
                }
                return -1;
            }

            public void set(int key, int value) {
                if(hmap.containsKey(key)) {
                    // Update existing
                    Node node = hmap.get(key);
                    node.value = value;
                    remove(node);
                    addToBack(node);
                } else {
                    // Add new
                    if(hmap.size() == capacity) {
                        removeFromFront();
                    }
                    Node newNode = new Node(key, value);
                    hmap.put(key, newNode);
                    addToBack(newNode);
                }
            }

            private void addToBack(Node node) {
                node.prev = tail.prev;
                node.next = tail;
                tail.prev.next = node;
                tail.prev = node;
            }

            private void removeFromFront() {
                Node first = head.next;
                head.next = first.next;
                first.next.prev = head;
                hmap.remove(first.key);
            }
            private void remove(Node node) {
                node.prev.next = node.next;
                node.next.prev = node.prev;
            }

        }

    }
}
