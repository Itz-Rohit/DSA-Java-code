package Linked_list;


class node18{
    int data ;
    node18 next;
    node18 prev;
    node18(int x){
        data=x;
        next=null;
        prev=null;
    }
}

public class circular_doubly_LL {
    static void prinntelist(node18 head){
        if (head==null){
            return ;
        }
        System.out.println(head.data+" ");
        for (node18 i=head.next;i!=head;i=i.next){
            System.out.println(i.data+" ");
        }
    }
    static node18 CDLL(node18 head ,int x){
        node18 temp = new node18(x);
        if (head== null){
            temp.next =temp;
            temp.prev = temp;
            return temp;
        }
        temp.prev=head.prev;
        temp.next =head;
        head.prev.next = temp;
        head.prev = temp;
        return temp;

    }

    public static void main(String[] args) {
        node18 head = new node18(10);
        node18 temp = new node18(20);
        node18 temp1= new node18(30);
        head.next=temp;
        temp.prev=head;
        temp.next=temp1;
        temp1.prev=temp;
        temp1.next=head;
        head.prev=temp1;

        System.out.println("orginal CLL");
        prinntelist(head);
        head = CDLL(head,40);
        System.out.println("CLL");
        prinntelist(head);
    }
}
