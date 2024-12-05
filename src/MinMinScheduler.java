import java.util.Scanner;

public class MinMinScheduler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Tasks, Machines;
        System.out.println("Enter number of machines and tasks");
        Machines = scanner.nextInt();
        Tasks = scanner.nextInt();

        int[][] minMin = new int[Machines][Tasks];
        int[][] tmp = new int[Machines][Tasks];
        int makespan = 0;

        System.out.println("Fill Data");
        for (int i = 0; i < Machines; i++)
            for (int j = 0; j < Tasks; j++) {
                minMin[i][j] = scanner.nextInt();
                tmp[i][j] = minMin[i][j];
            }


        System.out.println("Original Data");
        for (int i = 0; i < Machines; i++) {
            for (int j = 0; j < Tasks; j++)
                System.out.print(minMin[i][j] + " ");
            System.out.println();
        }

        // This array will hold the answer
        int[] resultTask = new int[Tasks];
        int[] resultMachine = new int[Tasks];
        int[] resultTime = new int[Tasks];
        int ptr = -1; // Indicates if the result set is full or not

        while (ptr < Tasks - 1) {
            int[] time = new int[Tasks];
            int[] machine = new int[Tasks];

            for (int j = 0; j < Tasks; j++) {
                int minimum = Integer.MAX_VALUE;
                int pos = -1;

                for (int i = 0; i < Machines; i++) {
                    if (minMin[i][j] < minimum) {
                        minimum = minMin[i][j];
                        pos = i;
                    }
                }

                time[j] = minimum;
                machine[j] = pos;
            }


            int minimum = Integer.MAX_VALUE;
            int pos = -1;

            for (int j = 0; j < Tasks; j++) {
                if (time[j] < minimum) {
                    minimum = time[j];
                    pos = j;
                }
            }

            resultTask[++ptr] = pos;
            resultMachine[ptr] = machine[pos];
            resultTime[ptr] = tmp[machine[pos]][pos];

            if (minimum > makespan)
                makespan = minimum;


            for (int i = 0; i < Machines; i++) {
                for (int j = 0; j < Tasks; j++) {
                    if (j == resultTask[ptr])
                        minMin[i][j] = Integer.MAX_VALUE;
                    else if (i == resultMachine[ptr] && minMin[i][j] != Integer.MAX_VALUE)
                        minMin[i][j] += minimum;
                    else
                        continue;
                }
            }
        }

        System.out.println("Scheduled Tasks :");
        for (int i = 0; i < Tasks; i++) {
            System.out.println(
                    "Task " + (resultTask[i] + 1) + " Runs on Machine " + (resultMachine[i] + 1) + " with Time "
                            + resultTime[i] + " units");
        }

        System.out.println("time taken to complete the last task in schedule : " + makespan + " units");
       scanner.close();
    }
}