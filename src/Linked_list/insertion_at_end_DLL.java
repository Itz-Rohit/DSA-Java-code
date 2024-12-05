package Linked_list;


class node9{
    int data;
    node9 prev;
    node9 next;
    node9(int x){
        data = x;
        prev=null;
        next=null;

    }


}

public class insertion_at_end_DLL {
    static void printlist(node9  head){
        node9 curr= head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr = curr.next;
        }
    }
    static node9 insertion_at_end_dll(node9 head , int data){
        node9 temp = new node9(data);
        if (head==null){
            return temp;
        }
        node9 curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return head;

    }

    public static void main(String[] args) {
        node9 head = new node9(40);
        head.next= new node9(90);
        head.next.next=new node9(50);
        head.next.prev= head;
        head.next.next.prev=head.next;
        System.out.println("original DLL");
        printlist(head);
        head = insertion_at_end_dll(head,60);
        System.out.println("After insertiom at the end");
        printlist(head);

    }
}
