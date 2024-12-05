package Linked_list;


class node13{
    int data;
    node13 next;
    node13(int x){
        data=x;
        next =null;
    }
}

public class traversing_CLL {
    static void circular(node13 head){
        if (head==null){
            return;
        }
        System.out.println(head.data+" ");
        for (node13 i=head.next;i!=head;i=i.next){
            System.out.println(i.data+" ");
        }
    }

    public static void main(String[] args) {
        node13 head = new node13(10);
        head.next = new node13(20);
        head.next.next = new node13(30);
        head.next.next.next= head;
        circular(head);
    }
}
