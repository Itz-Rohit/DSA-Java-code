package Linked_list;


class node{
    int data;
    node prev;
    node next;
    node(int x){
        data = x;
        prev=null;
        next=null;
    }
}

public class insert_at_begin_LL {
    static void printlist(node head){
        node curr = head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr = curr.next;
        }

    }
    static node insertatbegin(node head, int data){
        node temp = new node(data);
        temp.next=head;
        if(head != null){
            head.prev = temp;
        }
        return temp;

    }

    public static void main(String[] args) {
        node head = new node(20);
        head.next = new node(30);
        head.next.prev = head;
        System.out.println("original LL");
        printlist(head);
        head = insertatbegin(head, 40);
        System.out.println("After inserting ");
        printlist(head);
    }
}
