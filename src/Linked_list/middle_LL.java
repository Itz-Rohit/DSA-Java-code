package Linked_list;
class node20{
    int data;
    node20 next;
    node20(int x){
        data = x;
        next = null;
    }
}

public  class middle_LL {
    static void prinntliste(node20 head){
        node20 curr = head;
        while (curr!=null){
            System.out.println(curr.data+" ");
            curr = curr.next;
        }
    }


    static void printmiddle(node20 head) {
        if (head == null) {
            return;
        }
        node20 fast = head;
        node20 slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data + " ");
    }

    public static void main(String[] args) {
        node20 head = new node20(10);
        head.next = new node20(20);
        head.next.next = new node20(30);
        System.out.println("original list");
        prinntliste(head);

        System.out.println("Middle element");

        printmiddle(head);


    }
}
