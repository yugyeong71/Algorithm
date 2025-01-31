package algorithm;

import java.util.Scanner;

public class AplusB11021 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        for (int i = 1; i <= test; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println("Case #" + i + ": " + (A + B));
        }
    }
}
