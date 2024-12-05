package Linked_list;


class node4{
    int data;
    node4 next;
    node4(int x){
        data = x;
        next =null;
    }
}

public class deletion_at_begining {
    static void printlist( node4 head){
        node4 curr = head;
        while(curr != null){
            System.out.println(curr.data+" ");
            curr = curr.next;
        }

    }
    static node4 delete(node4 head){
        if(head == null){
            return null;

        }
        else{
            return head.next;
        }

    }

    public static void main(String[] args) {
        node4 head = new node4(10);
        head.next = new node4(20);
        head.next.next = new node4(30);
        System.out.println("original list|");
        printlist(head);

        head = delete(head);
        System.out.println("After deletion|");
        printlist(head);


    }
}
