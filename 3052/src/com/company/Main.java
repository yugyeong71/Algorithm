package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];
        boolean b;
        int result = 0;

        for(int i = 0; i < num.length; i++ ) {
            num[i] = sc.nextInt() % 42;
        }
        for(int i = 0; i < num.length; i++ ) {
            b = false;
            for(int k = i + 1 ; k < num.length; k++ ) {
                if( num[i] == num[k] ) {
                    b = true;
                    break;
                }
            }
            if( b == false ) {
                result ++;
            }
        }
        System.out.println(result);
    }
}
