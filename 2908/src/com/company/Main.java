package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();

    String a = Integer.toString(A);
    String b = Integer.toString(B);

    String aa = new StringBuffer(a).reverse().toString();
    String bb = new StringBuffer(b).reverse().toString();

    int AA = Integer.valueOf(aa);
    int BB = Integer.valueOf(bb);

    int MAX;

    if(AA > BB) MAX = AA;
    else MAX = BB;

    System.out.println(MAX);
    }
}
