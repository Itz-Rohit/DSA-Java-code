package Linked_list;

class node2{
    int data;
    node2 next;
    node2(int x){
        data =x;
        next =null;

    }


}

public class insertion_at_begining {
    static void printlist(node2 head){
        node2 curr = head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr = curr.next;
        }
    }
    static node2 insertbegin(node2 head,int x){
        node2 temp =new node2(x);
        temp.next=head;
        return temp;

    }
    public static void main(String[] args) {
        node2 head = null;
        head= insertbegin(head,30);
        head =insertbegin(head,20);
        head = insertbegin(head,40);
        printlist(head);


    }
}
