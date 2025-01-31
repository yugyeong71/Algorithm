package algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CutLine25305 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        Integer[] student = new Integer[N];

        for(int i = 0; i < N; i++){
            student[i] = sc.nextInt();
        }

        Arrays.sort(student, Collections.reverseOrder());

        System.out.println(student[K-1]);

    }
}