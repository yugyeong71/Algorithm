package com.company.src.algorithm;

import java.util.*;

public class DP9095 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        int[] array = new int[11];
        int N;

        array[1] = 1;
        array[2] = 2;
        array[3] = 4;

        for(int i = 0; i < test; i++){
            N = sc.nextInt();
            for(int j = 4; j <= N; j++){
                array[j] = array[j-1] + array[j-2] + array[j-3];
            }
            System.out.println(array[N]);
        }
    }
}
