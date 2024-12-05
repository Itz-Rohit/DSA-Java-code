package Linked_list;
class node22{
    int data;
    node22 next;
    node22(int x){
        data=x;
        next=null;

    }

}

public class Remove_duplicate {
    static void prrintlist(node22 head){
        node22 curr = head;
        while (curr!=null){
            System.out.println(curr.data+" ");
            curr=curr.next;
        }

    }
    static void removes(node22 head){
        node22 curr= head;
        while (curr!=null && curr.next!=null){
            if (curr.data == curr.next.data){
                curr.next = curr.next.next;
            }
            else {
                curr =curr.next;
            }
        }

    }

    public static void main(String[] args) {
        node22 head = new node22(10);
        head.next = new node22(20);
        head.next.next =new node22(20);
        head.next.next.next=new node22(30);
        System.out.println("original Linked LIst");
        prrintlist(head);
        removes(head);
        System.out.println("After removing Duplicates");
        prrintlist(head);

    }
}
