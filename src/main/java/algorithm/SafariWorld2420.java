package algorithm;

import java.util.Scanner;

public class SafariWorld2420 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long Sub = Math.abs(A-B);

        System.out.println(Sub);

    }
}
