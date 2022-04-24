package com.company.src.algorithm;

import java.util.*;

public class Average1546 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;
        int max = 0;
        int score;

        for (int i = 0; i < num; ++i) {
            score = sc.nextInt();
            sum += score;
            if (score > max) {
                max = score;
            }
        }
        sc.close();

        //double avg = 0;
        double avg = 100.0 * sum / max / num;
        System.out.printf("%.2f", avg);
    }
}
