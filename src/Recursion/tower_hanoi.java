package Recursion;


import javax.print.attribute.standard.Destination;

class hanoi{
    public void  tower(int n,char A,char B,char C){ //A=source , b = auxilary space , c=Destination
        if (n==1){
            System.out.println("move 1 form" +A+ "to" +C);
            return;

        }
        tower(n-1, A , C , B);
        System.out.println("Move" +n+ "form" +A+ "to" +C);
        tower(n-1,B,A,C);

    }
}



public class tower_hanoi {
    public static void main(String[] args) {
        hanoi obj = new hanoi();
        obj.tower(3, 'A','B','C');
//        System.out.println();


    }
}
