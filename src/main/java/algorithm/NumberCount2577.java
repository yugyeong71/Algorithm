package algorithm;

import java.util.Scanner;

public class NumberCount2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int result = A * B * C;
        String str = Integer.toString(result);

        int num[] = new int[10];
        for (int i = 0; i < str.length(); ++i) {
            num[str.charAt(i) - '0'] ++;
        }

        for(int i = 0; i < 10; i++){
            System.out.println(num[i]);
        }
    }
}
