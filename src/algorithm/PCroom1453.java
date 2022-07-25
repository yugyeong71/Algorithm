package com.company.src.algorithm;

import java.util.*;

public class PCroom1453 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int seat[] = new int[101];

        int refuse = 0;

        for(int i = 0; i < N; i++) {
            int num = sc.nextInt();
            seat[num] ++;
            if(seat[num] > 1)
                refuse ++;
        }
        System.out.println(refuse);
    }
}
