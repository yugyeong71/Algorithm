package com.company.src.algorithm;

import java.util.*;

public class NumberOfNumber1152 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        StringTokenizer st = new StringTokenizer(S," ");

        System.out.println(st.countTokens());
    }
}
