package com.company.src.algorithm;

import java.util.*;

public class Cooking2953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int winner = 0;
        int result = 0;

        for(int i = 0; i < 5;i++)
        {
            int sum = 0;
            for(int j = 0; j < 4; j++)
            {
                int score = sc.nextInt();
                sum += score;

                if(result <= sum) {
                    result = sum;
                    winner = i + 1;
                }
            }
        }
        System.out.println(winner + " " + result);
    }
}
