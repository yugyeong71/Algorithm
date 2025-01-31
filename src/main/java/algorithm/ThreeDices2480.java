package algorithm;

import java.util.Scanner;

public class ThreeDices2480 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int N3 = sc.nextInt();

        int result = 0;

        if (N1 == N2 && N2 == N3 && N1 == N3) {
            result = 10000 + N1 * 1000;
        }
        else if (N1 == N2 || N1 == N3) {
            result = 1000 + N1 * 100;
        }
        else if (N2 == N3) {			// 이 부분을 빼먹고 풀어서 계속 틀렸었다.
            result = 1000 + N2 * 100;
        }
        else {
            result = Math.max(N1,  Math.max(N2, N3)) * 100;
        }

        System.out.println(result);
    }
}
