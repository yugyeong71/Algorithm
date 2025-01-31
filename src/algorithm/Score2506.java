package com.company.src.algorithm;

import java.util.*;

public class Score2506 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int sum = 0;

        for(int i = 0; i < N; i++) {
            if(arr[i] == 1) {
                count++;
                sum += count;
            }
            else {
                count = 0;
            }
        }
        System.out.println(sum);
    }
}
