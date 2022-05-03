package com.company.src.algorithm;

import java.util.*;

public class ArithmeticOperations10869 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int sum = A + B;
        int sub = A - B;
        int mul = A * B;
        int div = A / B;
        int remainder = A % B;

        System.out.println(sum + "\n" + sub + "\n" + mul + "\n" + div + "\n" + remainder);

    }
}
