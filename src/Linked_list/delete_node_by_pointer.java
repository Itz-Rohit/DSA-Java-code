package Linked_list;

class node26{
    int data;
    node26 next;
    node26(int x){
        data=x;
        next = null;

    }
}

public class delete_node_by_pointer {
    static void printlissstee(node26 head){
        node26 curr = head;
        while (curr!=null){
            System.out.println(curr.data+" ");
            curr=curr.next;
        }
    }
    static void delete_by_pointer(node26 ptr){
        if (ptr==null || ptr.next==null){
            return;
        }
        ptr.data=ptr.next.data;
        ptr.next = ptr.next.next;


    }

    public static void main(String[] args) {
        node26 head=new node26(10);
        head.next=new node26(20);
        head.next.next =new node26(30);
        head.next.next.next=new node26(40);
        System.out.println("original LInked list");
        printlissstee(head);
        delete_by_pointer(head.next);
        System.out.println("After deleting using a pointer :");
        printlissstee(head);
    }

}
