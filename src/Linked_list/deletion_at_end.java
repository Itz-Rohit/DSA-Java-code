package Linked_list;


class node5{
    int data;
    node5 next;
    node5(int x){
        data = x;
        next = null;

    }
}

public class deletion_at_end {
    static void printlistt(node5 head){
        node5 curr = head;
        while (curr!= null){
            System.out.println(curr.data+" ");
            curr = curr.next;
        }

    }
    static node5 delete_at_end(node5 head){
        if(head==null){
            return null;
        }
        if(head.next == null){
            return null;
        }
        node5 curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
        return head;

    }

    public static void main(String[] args) {
        node5 head = new node5(20);
        head.next = new node5(40);
        head.next.next = new node5(50);
        System.out.println("Original list");
        printlistt(head);
        head = delete_at_end(head);
        System.out.println("After deletion");
        printlistt(head);
    }


}
