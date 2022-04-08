package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int result = 0;

        for(int i = 1; i < n; i++)
        {
            int num = i;
            int sum = 0;

            while(true)
            {
                sum = sum + (num % 10);
                num = num / 10;

                if(num == 0)
                {
                    break;
                }
            }
            if(n == (sum + i))
            {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
