package com.company.src.algorithm;

import java.io.IOException;
import java.util.*;

public class WordSort1181 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String[] arString = new String[num];

        for (int i = 0; i < num; i++) {
            arString[i] = sc.next();
        }

        Arrays.sort(arString, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                else {
                    return o1.length() - o2.length();
                }
            }
        });

        for (int i = 0; i < arString.length; i++) {
            if (i != 0) {
                if (!(arString[i].equals(arString[i - 1]))) {
                    System.out.println(arString[i]);
                }
            }

            else {
                System.out.println(arString[i]);
            }
        }
    }
}
