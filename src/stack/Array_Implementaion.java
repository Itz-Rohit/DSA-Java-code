package stack;


class Array_Implementaion {
    int arr[];
    int cap;
    int top;

    Array_Implementaion(int x) {
        top = -1;
        cap = x;
        arr = new int[cap];

    }

    void push(int x) {
        if (top == cap -1){
            System.out.println("stack overflow");
            return;
        }
        top++;
        arr[top] = x;
    }

    int pop() {
        int res = arr[top];
        if (top==-1){
            System.out.println("stach underflow");
        }
        top--;
        return res;
    }

    int size() {
        if (top==-1){
            System.out.println();
        }
        return top + 1;
    }

    boolean isEmpty() {
        return (top == -1);
    }


    public static void main(String[] args) {
        Array_Implementaion obj = new Array_Implementaion(2);

        obj.push(20);
        System.out.println(obj.pop());

        obj.push(30);
        System.out.println(obj.pop());

        obj.push(40);
        System.out.println(obj.pop());
        obj.push(50);
        System.out.println(obj.pop());
        obj.push(60);
        System.out.println(obj.pop());



    }
}



