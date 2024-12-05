package Linked_list;
class node15{
    int data;
    node15 next;
    node15(int x){
        data =x;
        next =null;
    }
}

public class insert_at_begin_CLL {
    static void priinttlist(node15 head) {
        if (head==null){
            return;
        }
        System.out.println(head.data+" ");
        for (node15 i=head.next;i!=head;i=i.next){
            System.out.println(i.data+" ");
        }
    }

    static node15 brgin_CLL(node15 head,int x){
        node15 temp = new node15(x);
        if (head == null){
            temp.next=temp;
            return temp;
        }
        else{
            temp.next = head.next;
            head.next = temp;
            int a = head.data;
            head.data = temp.data;
            temp.data=a;
            return head;
        }
    }

    public static void main(String[] args) {
        node15 head =  new node15(10);
        head.next = new node15(20);
        head.next.next= new node15(30);
        head.next.next.next = head;
        System.out.println("Original CLL");
        priinttlist(head);
        head =  brgin_CLL(head , 40);
        System.out.println("After adding ");
        priinttlist(head);
    }
}
