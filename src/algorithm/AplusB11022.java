package com.company.src.algorithm;

import java.util.*;

public class AplusB11022 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        for (int i = 1; i <= test; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A + B));
        }

    }
}
