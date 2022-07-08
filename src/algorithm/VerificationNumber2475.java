package com.company.src.algorithm;

import java.util.*;

public class VerificationNumber2475 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int div = 0;

        for(int i = 0; i < 5; i++){
            int N = sc.nextInt();
            int Square = N * N;
            sum += Square;
            div = sum % 10;
        }

        System.out.println(div);
    }
}
