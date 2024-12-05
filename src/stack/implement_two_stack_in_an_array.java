package stack;



class two_stack {
    int arr[], top1, top2, cap;

    two_stack(int n) {
        cap = n;
        top1 = -1;
        top2 = n;
        arr = new int[n];
    }


    void push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        }

    }

    void push2(int x) {
        if (top1 > top2 - 1) {
            top2--;
            arr[top2] = x;

        }

    }

    int pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;

        }
        System.out.println("Stack Underflow for stack 1");
        return -1;

    }

    int pop2() {
        if (top2 >= 0) {
            int x = arr[top2];
            top2++;
            return x;
        }
        System.out.println("Stack Underflow for stack 2");
        return -1;
    }


}
public class implement_two_stack_in_an_array {
    public static void main(String[] args) {
        two_stack ts = new two_stack(5);

        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);

        System.out.println("Popped element from stack1 is: " + ts.pop1());
        ts.push2(40);

    }
}