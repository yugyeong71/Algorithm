package com.company.src.algorithm;

import java.util.*;

public class PrimeNumber1978 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 0;

        for(int i = 0; i < N; i++) {
            boolean isPrime = true;

            int M = sc.nextInt();

            if(M == 1) {
                continue;
            }
            for(int j = 2; j <= Math.sqrt(M); j++) {
                if(M % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                count++;
            }
        }
        System.out.println(count);
    }
}
