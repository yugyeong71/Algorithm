package com.company.src.algorithm;

import java.util.*;

public class Blackjack2798 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, M;
        int[] A = new int[100];
        N = sc.nextInt();
        M = sc.nextInt();

        int result = 0;

        for(int i = 0; i < N; i++)
            A[i] = sc.nextInt();

        for(int i = 0; i < N - 2; i++){
            for(int j = i + 1; j < N - 1; j++){
                for(int k = j + 1; k < N;k++){
                    if(A[i] + A[j] + A[k] <= M && M - (A[i] + A[j] +A[k]) < M - result){
                        result = A[i] + A[j] + A[k];
                    }
                }
            }
        }
        System.out.println(result);
    }
}
