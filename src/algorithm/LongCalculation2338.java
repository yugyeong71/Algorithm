package com.company.src.algorithm;

import java.math.BigInteger;
import java.util.*;

public class LongCalculation2338 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();

        System.out.println(A.add(B));
        System.out.println(A.subtract(B));
        System.out.println(A.multiply(B));
    }
}
