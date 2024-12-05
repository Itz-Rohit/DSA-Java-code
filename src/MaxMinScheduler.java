import java.util.*;
import java.util.Scanner;
public class MaxMinScheduler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tasks ,machines;
        System.out.println("Enter no of tasks and machines");
        tasks = scanner.nextInt();
        machines =scanner.nextInt();
        int [][] MaxMin = new int[tasks][machines];
        int [][] temp = new int [tasks][machines];
        int makespan =0;
        System.out.println("fill data");
        for(int i=0;i<machines;i++)
            for(int j=0;j<tasks;j++){
                MaxMin[i][j]= scanner.nextInt();
                temp[i][j] = MaxMin[i][j];
            }
        System.out.print("original data");
        for ( int i=0;i<machines;i++){
            for (int j=0; j<tasks;j++)
                System.out.println(MaxMin[i][j] + " ");
            System.out.println();


        }





    }
}
