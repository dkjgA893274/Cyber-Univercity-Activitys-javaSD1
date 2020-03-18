import java.util.Scanner;
import java.util.Random;

public class Ex_09_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("サイコロを振る回数 > ");
        int n = scan.nextInt();

        int[] dice = rollDice(n);

        for (int i=0; i<n; i++) {
            System.out.print("  " + dice[i]);
            if ((i+1)%20 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static int[] rollDice(int n) {
        Random rand = new Random();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = rand.nextInt(6) + 1;
        }

        return arr;
    }
}