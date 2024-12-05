package Linked_list;

class node24{
    int data;
    node24 next;
    node24(int x){
        data=x;
        next=null;
    }

}

public class detect_loop_flyodcycle {

    boolean isloop(node24 head){
        node24 fast = head;
        node24 slow = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast==slow)
                return true;



        }
        return false;

    }

    public static void main(String[] args) {
        node24 head = new node24(10);
        head.next =new node24(20);
        head.next.next =new node24(30);
        head.next.next.next=new node24(40);
        head.next.next.next.next=head.next;
        detect_loop_flyodcycle obj = new detect_loop_flyodcycle();
        if (obj.isloop(head)){
            System.out.println("loop is detected");
        }
        else{
            System.out.println("loop is not detected");
        }


    }
}
