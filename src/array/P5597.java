package array;

import java.util.Scanner;

public class P5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[31];

        for (int i = 1; i <= 28; i++) {
            int j = sc.nextInt();
            x[j] = j;
        }

        for (int k = 1; k <= 30; k++) {
            if (x[k] == 0) {
                System.out.println(k);
            }
        }
    }
}

