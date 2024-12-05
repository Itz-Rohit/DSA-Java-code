package Linked_list;

class node30 {
    int data;
    node30 next;

    node30(int x) {
        data = x;
        next = null;
    }
}

public class Insertion_point {
    static void intersection(node30 head_1, node30 head_2) {
        int count = 0;
        node30 curr1 = head_1;
        while (curr1 != null) {
            int d = count++;
            curr1 = curr1.next;
        }
        System.out.println("Length of list 1: " + count);

        int count_1 = 0;
        node30 curr2 = head_2;
        while (curr2 != null) {
            int e = count_1++;
            curr2 = curr2.next;
        }
        System.out.println("Length of list 2: " + count_1);


        int s = Math.abs(count - count_1);
        node30 longer = (count > count_1) ? head_1 : head_2;
        node30 shorter = (count > count_1) ? head_2 : head_1;

        for (int i = 0; i < s; i++) {
            longer = longer.next;
        }


        while (longer != null && shorter != null) {
            if (longer == shorter) {
                System.out.println("Intersection point: " + longer.data);
                return;
            }
            longer = longer.next;
            shorter = shorter.next;
        }

        System.out.println("No intersection point found.");
    }

    public static void main(String[] args) {
        node30 head1 = new node30(1);
        head1.next = new node30(2);
        head1.next.next = new node30(3);
        head1.next.next.next = new node30(4);
        head1.next.next.next.next = new node30(5);

        node30 head2 = new node30(9);
        head2.next = new node30(10);
        head2.next.next = head1.next.next;

        intersection(head1, head2);
    }
}
