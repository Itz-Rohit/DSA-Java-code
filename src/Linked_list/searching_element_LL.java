package Linked_list;


class node7{
    int data;
    node7 next;
    node7(int x){
        data =x;
        next=null;
    }
}

public class searching_element_LL {
    static void printliist(node7 head){
        node7 curr = head;
        while(curr!= null)
        {
            System.out.println(curr.data+" ");
            curr = curr.next;
        }
    }
    public int search(node7 head , int x){
        int pos =1;
        node7 curr = head;
        while(curr!=null){
            if(curr.data==x){
                return pos;
            }
            else{
                pos++;
                curr = curr.next;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        node7 head = new node7(20);
        head.next = new node7(30);
        head.next.next = new node7(40);
        System.out.println("orginal LL");
        printliist(head);
        searching_element_LL obj = new searching_element_LL();
        int position = obj.search(head, 40);
        System.out.println("Position of element 40 in LL: " + position);
    }





}
