package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

    int[] str = new int[26];

    for(int i = 0; i < str.length; i++){
        str[i] = -1;
    }

    String S = sc.nextLine();

    for(int i = 0; i < S.length(); i++){
        char c = S.charAt(i);

        if(str[c - 'a' ] == -1){
            str[c - 'a'] = i;
        }

    }

    for(int val : str){
        System.out.print(val + " ");
    }

    }
}
