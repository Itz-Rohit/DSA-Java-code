package Linked_list;

class node16{
    int data;
    node16 next;
    node16(int x){
        data = x;
        next = null;
    }
}

public class delete_head_CLL {
    static void printelist(node16 head){
        if (head==null){
            return;
        }
        System.out.println(head.data+" ");
        for(node16 i=head.next;i!=head;i=i.next){
            System.out.println(i.data+" ");
        }
    }
    static node16 head_delete(node16 head){
        if (head==null){
            return null;
        }
        if (head.next == head){
            return null;
        }
        head.data= head.next.data;
        head.next = head.next.next;
        return head;
    }

    public static void main(String[] args) {
        node16 head = new node16(10);
        head.next = new node16(20);
        head.next.next = new node16(30);
        head.next.next.next = head;
        System.out.println("Original CLL");
        printelist(head);
        head = head_delete(head);
        System.out.println("After deleting head");
        printelist(head);
    }

}
