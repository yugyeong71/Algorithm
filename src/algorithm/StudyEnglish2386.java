package com.company.src.algorithm;

import java.util.*;

public class StudyEnglish2386 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true) {
            String N = sc.nextLine();

            if (N.equals("#"))
                System.exit(0);

            String strArr[] = N.toLowerCase().split("");

            int count = 0;
            for (int i = 0; i < strArr.length; i++) {
                if (N.split(" ")[0].equals(strArr[i]))
                    count++;
            }
            System.out.println(N.split(" ")[0] + " " + (count - 1));
        }
    }
}
