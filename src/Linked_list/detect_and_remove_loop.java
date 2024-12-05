package Linked_list;
class node25{
    int data;
    node25 next;
    node25(int x){
        data =x;
        next =null;
    }
}


public class detect_and_remove_loop {
    static void printtelist(node25 head){
        node25 curr = head;
        while (curr!=null){
            System.out.println(curr.data+" ");
            curr =curr.next;
        }
    }
    void   detect_remove(node25 head){
        node25 fast=head;
        node25 slow =head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast= fast.next.next;
            if (slow==fast){
                break;
        }

           }
        if (slow!=fast){
            return;

        }
        slow = head;
        while (slow.next!=fast.next){
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;
    }

    public static void main(String[] args) {
        node25 head= new node25(10);
        head.next=new node25(20);
        head.next.next=new node25(30);
        head.next.next.next=new node25(40);
        head.next.next.next.next=new node25(50);
        head.next.next.next.next.next=head.next;
        detect_and_remove_loop obj= new detect_and_remove_loop();
        obj.detect_remove(head);
        System.out.println("After removing loop");
        printtelist(head);



    }
}
