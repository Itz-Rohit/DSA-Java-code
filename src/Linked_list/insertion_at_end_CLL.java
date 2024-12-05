package Linked_list;
class node14{
    int data;
    node14 next;
    node14(int x){
        data =x;
        next =null;
    }
}

public class insertion_at_end_CLL {
    static void priintlist(node14 head) {
        if (head==null){
            return;
        }
        System.out.println(head.data+" ");
        for (node14 i=head.next;i!=head;i=i.next){
            System.out.println(i.data+" ");
        }
    }

    static node14 brgin_CLL(node14 head,int x){
        node14 temp = new node14(x);
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
            return temp;
        }
    }

    public static void main(String[] args) {
        node14 head =  new node14(10);
        head.next = new node14(20);
        head.next.next= new node14(30);
        head.next.next.next = head;
        System.out.println("Original CLL");
        priintlist(head);
        head =  brgin_CLL(head , 40);
        System.out.println("After adding ");
        priintlist(head);
    }
}
