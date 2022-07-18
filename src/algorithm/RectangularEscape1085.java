package com.company.src.algorithm;

import java.util.*;

public class RectangularEscape1085 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int a = x - 0;
        int b = w - x;
        int c = y - 0;
        int d = h - y;

        int[] arr = {a, b, c, d};

        int min = arr[0];

        for (int i : arr) {
            if(i < min) {
                min = i;
            }
        }
        System.out.println(min);
    }
}
