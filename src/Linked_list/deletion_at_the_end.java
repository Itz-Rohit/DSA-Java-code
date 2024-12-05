package Linked_list;

class node12{
    int data;
    node12 prev;
    node12 next;
    node12(int x){
        data=x;
        prev=null;
        next=null;
    }


        }

public class deletion_at_the_end {
    static void printlistee(node12 head){
        node12 curr = head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr= curr.next;
        }
    }

    static node12 delete(node12 head){
        if (head==null){
            return head;

        }
        if (head.next==null){
            return head;
        }
        node12 curr = head;
        while (curr.next!=null){
            curr = curr.next;

        }
        curr.prev.next = null;
        return head;

    }

    public static void main(String[] args) {
        node12 head = new node12(10);
        head.next = new node12(20);
        head.next.next = new node12(30);
        head.next.prev= head;
        head.next.next.prev = head.next;
        System.out.println("Original DLL");
        printlistee(head);
        head= delete(head);
        System.out.println("After Deletion");
        printlistee(head);

    }
}
