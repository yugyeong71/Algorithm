package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int result = factorial(num);
        System.out.println(result);
    }

    public static int factorial(int N){
        if(N < 1) {
            return 1;
        }
        return N * factorial(N-1);
    }
}
