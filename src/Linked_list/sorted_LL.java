package Linked_list;

class node19{
    int data;
    node19 next;
    node19(int x){
        data=x;
        next =null;
    }
}

public class sorted_LL {
    static void printlisstee(node19 head){
        node19 curr = head;
        while (curr!=null){
            System.out.println(curr.data+" ");
            curr = curr.next;

        }

    }

    static node19 sortedLL(node19 head , int x){
        node19 temp= new node19(x);
        if (head==null){
            return temp;

        }
        if (x< head.data){
            temp.next =head;
            return temp;
        }
        node19 curr = head;
        while (curr.next!=null && curr.next.data<x){
            curr = curr.next;
        }
        temp.next= curr.next;
        curr.next =temp;
        return head;
    }

    public static void main(String[] args) {
        node19 head= new node19(10);
        head.next=new node19(20);
        head.next.next= new node19(30);

        System.out.println("original LL");
        printlisstee(head);
        head = sortedLL(head , 35);
        System.out.println("after addig list");
        printlisstee(head);
    }
}
