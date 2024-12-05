package Linked_list;
class node31{
    int data;
    node31 next;
    node31(int x){
        data=x;
        next=null;
    }
}

public class pairwise_swap {
    static void swap(node31 head1,node31 head2){
        int temp = head1.data;
        head1.data= head2.data;
        head2.data=temp;
    }
    static void pairwsie(node31 head){
        node31 curr = head;
        while (curr!=null && curr.next!=null){
            swap(curr , curr.next);
                curr= curr.next.next;


        }


        }
    static void prinnntlistee(node31 head){
        node31 curr = head;
        while (curr!=null){
            System.out.println(curr.data+" ");
            curr = curr.next;
        }

    }

    public static void main(String[] args) {
        node31 head = new node31(10);
        head.next = new node31(20);
        head.next.next= new node31(30);
        head.next.next.next = new node31(40);
        System.out.println("Original list");
        prinnntlistee(head);
        pairwise_swap obj= new pairwise_swap();
        obj.pairwsie(head);
        System.out.println("After swapping");
        prinnntlistee(head);

    }
}
