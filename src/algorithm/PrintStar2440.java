package com.company.src.algorithm;

import java.util.*;

public class PrintStar2440 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            for(int j = N; j > 0; j--){
                if(j > i){
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }
}
