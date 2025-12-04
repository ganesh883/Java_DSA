package LinkedList;

public class Print_LinkedLst {
    public static void main(String[] args) {

        ListNode A = new ListNode(1);
        A.next= new ListNode(2);
        A.next.next = new ListNode(3);


        while(A!=null){
            System.out.println(A.val+" ");
            A=A.next;
        }
    }
}

class ListNode{
    public int val;
    public ListNode next;
    ListNode(int x){
        val=x;
        next=null;
    }
}
