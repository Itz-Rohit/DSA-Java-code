package Linked_list;
class    node10{
    int data;
    node10 prev;
    node10 next;
    node10(int x){
        data = x;
        prev=null;
        next=null;
    }
}

public class reverse_DLL {
    static void printlist(node10 head){
        node10 curr = head;
        while (curr!=null){
            System.out.println(curr.data+" ");
            curr = curr.next;
        }

    }

    static node10 reverse(node10 head){
        node10 curr = head;
        node10 prev = null;
        if(head==null || head.next==null)
            return  head;
//        node10 curr = head;
        while(curr!=null){
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr =  curr.prev;

        }
        return prev.prev;
    }

    public static void main(String[] args) {
        node10 head = new node10(20);
        head.next = new node10(30);
        head.next.next = new node10(40);
        head.next.prev = head;
        head.next.next.prev = head.next;
        System.out.println("Original DLL");
        printlist(head);
        head = reverse(head);
        System.out.println("After reversing ");
        printlist(head);
    }
}
