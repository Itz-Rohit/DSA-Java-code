package Linked_list;
 class node17{
     int data;
     node17 next;
     node17(int x){
         data=x;
         next= null;
     }
 }

public class delete_kth_link_CLL {
     static void printlistee(node17 head){
         if (head==null){
             return;
         }
         System.out.println(head.data+" ");
         for (node17 a =head.next;a!=head;a=a.next){
             System.out.println(a.data+" ");
         }
     }
     static node17 delete_head(node17 head){
         if (head==null){
             return null;
         }
         if (head.next==head){
             return null;
         }
         head.data= head.next.data;
         head.next= head.next.next;
         return head;

     }
     static node17 kth_position(node17 head , int x){
         if (head==null){
             return head;
         }
         if (x==1){
             return delete_head(head);
         }
         node17 curr = head;
         for (int i=0;i<x-2;i++){
             curr=curr.next;

         }
         curr.next = curr.next.next;
         return head;

     }

    public static void main(String[] args) {
        node17 head = new node17(10);
        head.next =new node17(20);
        head.next.next=new node17(30);
        head.next.next.next=head;
        System.out.println("Original CLL");
        printlistee(head);
        head = kth_position(head,2);
        System.out.println("After kth deletion");
        printlistee(head);
    }
}
