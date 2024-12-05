package Linked_list;

class node8{
    int data;
    node8 prev;
    node8 next;
    node8(int x){
        data =x;
        prev= null;
        next = null;
    }

}

public class doubly_LL {
    static void printlist(node8 head){
        node8 curr = head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        node8 head = new node8(10);
        node8 temp = new node8(20);
        node8 temp1 = new node8(30);
        head.next = temp;
        temp .prev = head;
        temp.next = temp1;
        temp1.prev = temp;
        printlist(head);
    }
}
