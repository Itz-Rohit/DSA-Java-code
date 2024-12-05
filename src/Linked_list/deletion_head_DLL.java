package Linked_list;
class node11{
    int data;
    node11 prev;
    node11 next;
    node11(int x){
        data =x;
        prev = null;
        next = null;
    }
}

public class deletion_head_DLL {
    static void printliste( node11 head) {
        node11 curr = head;
        while (curr != null) {
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
    }
    static node11 deletion(node11 head){
        if (head == null){
            return null;
        }
        if (head.next == null){
            return null;
        }
        else{
            head =head.next;
            head.prev=null;
            return head;

        }

    }

    public static void main(String[] args) {
        node11 head = new node11(10);
        head.next = new node11(20);
        head.next.next = new node11(30);
        head.next.prev = head;
        head.next.next.prev = head.next;
        System.out.println("original DLL");
        printliste(head);
        head = deletion(head);
        System.out.println("After deletion");
        printliste(head);
    }

}
