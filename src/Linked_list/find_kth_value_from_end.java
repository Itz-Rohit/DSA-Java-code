package Linked_list;

class node21{
    int data;
    node21 next;
    node21(int x){
        data=x;
        next=null;
    }
}

public class find_kth_value_from_end {
    static void  kth_value_end(node21 head , int n){
//        node21 curr = head;
        int len =0;
        for (node21 curr =head;curr!=null;curr=curr.next){
            len++;


            }
        if (n>len){
            return;


        }
        node21 curr = head;
        for (int i=1;i<len-n+1;i++){
            curr=curr.next;

        }
        System.out.println(curr.data+" ");


    }

    public static void main(String[] args) {
        node21 head = new node21(10);
        head.next = new node21(20);
        head.next.next = new node21(30);
        head.next.next.next = new node21(40);
        System.out.println("valur from the end :");
        kth_value_end(head,3);

    }
}
