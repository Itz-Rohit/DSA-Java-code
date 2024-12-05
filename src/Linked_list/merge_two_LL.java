package Linked_list;

class node32{
    int data;
    node32 next;
    node32(int x){
        data=x;
        next=null;
    }
}

public class merge_two_LL {
    static void prinntttttlis(node32 head){
        node32 curr= head;

        while (curr!=null){
            System.out.println(curr.data+" ");
            curr= curr.next;
        }
    }
    static node32 merge(node32 a, node32 b) {
        if (a==null){
            return b;
        }
        if (b==null){
            return a;
        }
        node32 head=null,tail=null;
        if (a.data<=b.data){
            head=tail=a;
            a=a.next;
        }
        else {
            head=tail=b;
            b=b.next;
        }
        while (a!=null && b!=null){
            if (a.data<=b.data){
                tail.next=a;
                tail=a;
                a= a.next;
            }
            else{
                tail.next=b;
                tail=b;
                b=b.next;
            }
        }
        if (a==null){
            tail.next=b;

        }
        else{
            tail.next=a;
        }
        return  head;

    }

    public static void main(String[] args) {
        node32  a= new node32(1);
        a.next = new node32(2);
        a.next.next=new node32(3);
        node32 b=new node32(1);
        b.next=new node32(4);
        System.out.println("Original LL A:");
        prinntttttlis(a);
        System.out.println("original LL B:");
        prinntttttlis(b);
        node32 merging = merge(a,b) ;
        System.out.println("After merging");
        prinntttttlis(merging);


    }
}










