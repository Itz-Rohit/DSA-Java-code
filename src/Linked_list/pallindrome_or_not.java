package Linked_list;

class node33{
    int data;
    node33 next;
    node33(int x){
        data=x;
        next=null;
    }
}
public class pallindrome_or_not {
    static node33 reverse(node33 head) {
        node33 prev = null;
        node33 curr = head;
        while (curr != null) {
            node33 next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    static void printnlust(node33 head){
        node33 curr = head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr=curr.next;
        }
    }
    static  boolean  ispallindrome(node33 head){
        if (head==null){
            return true;
        }
        node33 slow=head,fast=head;
        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast =fast.next.next;
        }
        node33 rev=reverse(slow.next);
        node33 curr =head;
        while (rev!=null){
            if (rev.data!= curr.data)
                return false;
            rev=rev.next;
            curr=curr.next;



        }
        return true;

    }

    public static void main(String[] args) {
        node33 head = new node33(1);
        head.next =new node33(6);
        head.next.next=new node33(4);
        head.next.next.next=new node33(6);
        head.next.next.next.next=new node33(1);
        System.out.println("Original LL");
        printnlust(head);
        boolean result = ispallindrome(head);
        if (result){
            System.out.println("This is pallindrome");
        }
        else{
            System.out.println("this is not palindrome");
        }




    }
}
