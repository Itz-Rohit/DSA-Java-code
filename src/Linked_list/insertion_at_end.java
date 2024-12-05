package Linked_list;



class node3{
    int data ;
    node3 next;
    node3(int x){
        data =x;
        next =null;
    }
}

public class insertion_at_end {
    static void  printlistt(node3 head) {
        node3 curr = head;
        while (curr != null) {
            System.out.println(curr.data + " ");
            curr = curr.next;
        }

    }

    static node3 insertatend(node3 head,int x){
        node3 temp = new node3(x);
        if(head == null){
            return temp;
        }
        node3 curr = head;
        while(curr.next != null){
            curr =curr.next;

        }
        curr.next =temp;
        return head;

    }



    public static void main(String[] args) {
        node3 head = new node3(20);
        head.next = new node3(40);
        System.out.println("original lsit|");
        printlistt(head);
        head = insertatend(head,30);

        System.out.println("After adding|");


        printlistt(head);
    }


}
