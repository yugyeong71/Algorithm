package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumber2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int M[] = new int[N];

        for(int i = 0; i < N; i++){
             M[i] = sc.nextInt();
        }

        Arrays.sort(M);

        for (int i : M) {
            System.out.print(i + "\n");
        }
    }
}
