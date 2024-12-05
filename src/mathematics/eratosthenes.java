package mathematics;
import java.lang.reflect.Array;
import java.util.*;

public class eratosthenes {
    public static void main(String[] args) {
        int prime;
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = scanner.nextInt();
        soln4 solution = new soln4();
        System.out.println("Using sieve of eratostenes " + a + " is :");
        solution.sieve(a);

    }
}
class soln4 {
    boolean isprime(int a) {
        if (a == 1) {
            return false;
        }
        if (a == 2 || a == 3) {
            return true;
        }
        if (a % 2 == 0 || a % 3 == 0) {
            return false;
        }
        for (int i = 2; i * i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void sieve(int a) {
//    int size = a + 1;
        boolean[] boolarray = new boolean[a + 1];
        Arrays.fill(boolarray, true);
        for (int i = 2; i * i <= a; i++) {
            if (isprime(a))
                for (int j = i * i; j < a; j = j + i)
                    boolarray[j] = false;


        }
        for (int i = 2; i <= a; i++) {
            if (isprime(i)) {
                System.out.println(i);
            }
        }
    }
}







