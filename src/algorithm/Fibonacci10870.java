package com.company.src.algorithm;

import java.util.*;

public class Fibonacci10870 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(fibonacchi(n));
    }

    static int fibonacchi(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fibonacchi(n - 1) + fibonacchi(n - 2);
    }
}
