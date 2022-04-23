package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    if(N < 10){
        N *= 10;
    }

    int N1 = 0, N2 = 0;
    int cnt = 0;
    int result = N;

    while (true){
        N1 = result / 10;
        N2 = result % 10;
        result = N1 + N2;

        result = N2 * 10 + result % 10;

        cnt ++;

        if(result == N) break;
    }

    System.out.println(cnt);
    }
}
