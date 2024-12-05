package Linked_list;


class node6{
    int data;
    node6 next;
    node6(int x){
        data =x;
        next= null;
    }
}
public class insert_at_any_position {
    static void printlsttt(node6 head){
        node6 curr = head;
        while(curr!= null){
            System.out.println(curr.data+" ");
            curr= curr.next;
        }
    }
    static node6 insertatpos(node6 head,int pos, int data){
        node6 temp = new node6(data);
        if (pos==1){
            temp.next= head;
            return head;
        }
        node6 curr = head;
        for (int i=0;i<pos-2 && curr!=null;i++)
            curr= curr.next;
        if (curr == null){
            return head;
        }
        temp.next= curr.next;
        curr.next = temp;
        return  head;
    }

    public static void main(String[] args) {
        node6 head = new node6(30);
        head.next = new node6(40);
        head.next.next = new node6(50);
        System.out.println("original list");
        printlsttt(head);
        head = insertatpos(head,3,35);
        System.out.println("after inserting ");
        printlsttt(head);


    }

}
