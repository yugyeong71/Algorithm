package algorithm;

import java.util.Scanner;

public class SumNumber11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 숫자 개수 입력
        String str = sc.next();

        int sum = 0;

        for(int i = 0; i < N; i++){
            sum += str.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}
