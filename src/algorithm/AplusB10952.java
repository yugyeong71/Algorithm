package com.company.src.algorithm;

import java.util.Scanner;

import java.util.*;

public class AplusB10952 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = 0;
        int B = 0;

        while(true){
            A = sc.nextInt();
            B = sc.nextInt();

            if(A == 0 && B == 0){
                break;
            }

            System.out.println(A + B);
        }
    }
}
