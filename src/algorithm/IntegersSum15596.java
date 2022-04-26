package com.company.src.algorithm;

import java.util.*;

public class IntegersSum15596 {
        static long sum(int[] a) {
            long ans = 0;
            for(int i  = 0; i < a.length; i++){
                ans += a[i];
            }
            return ans;
        }

        public static void main(String[] args){
            Scanner in = new Scanner(System.in);

            int n = in.nextInt();
            int arr[] = new int[n];

            for(int i =0;i<arr.length;i++) {
                arr[i] = in.nextInt();
            }

            System.out.println(sum(arr));

        }
}



