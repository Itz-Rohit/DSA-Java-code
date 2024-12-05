package stack;





class node{
    int data;
    node next;
    node(int x){
        data=x;
        next=null;
    }
}

public class Linked_List_Imolemnetation {
    node head;
    int size;
     Linked_List_Imolemnetation(){
        head=null;
        size=0;
    }
    int size(){
        return size;
    }
    boolean isEmpty() {
        return (head == null);
    }
    void push(int x){
        node temp = new node(x);
        temp.next = head;
        head=temp;
        size++;
    }
    int pop(){
        if (head == null)

            return Integer.MAX_VALUE;
        int res = head.data;

        head=head.next;

        size--;
        return res;

        }
        int peek() {

            if (head == null)
                return Integer.MAX_VALUE;
            return  head.data;
        }

    public static void main(String[] args) {
         Linked_List_Imolemnetation obj = new Linked_List_Imolemnetation();
         obj.push(10);
         obj.push(20);
         obj.push(30);
        System.out.println("Top element is: " + obj.peek());
        System.out.println("Popped element is: " + obj.pop());
        System.out.println("Top element is: " + obj.peek());
        System.out.println("Stack size is: " + obj.size());
        System.out.println("Is stack empty? " + obj.isEmpty());

        obj.pop();
        obj.pop();

        System.out.println("Is stack empty? " + obj.isEmpty());
        System.out.println("Popped element is: " + obj.pop());

    }


}

