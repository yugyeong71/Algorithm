package com.company.src.algorithm;

import java.util.*;

public class Big4101 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A, B;

        while (true){
            A = sc.nextInt();
            B = sc.nextInt();

            if(A > B){
                System.out.println("Yes");
            }

            else if(A == 0 && B == 0){
                break;
            }

            else {
                System.out.println("No");
            }

        }
    }
}
