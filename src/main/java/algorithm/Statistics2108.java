package algorithm;

import java.util.Scanner;

public class Statistics2108 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[8001];

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int center = 10000;
        int mode = 10000;

        for(int i = 0; i < N; i++){
            int M = sc.nextInt();
            sum += M;
            arr[M + 4000] ++;

            if(max < M){
                max = M;
            }

            if(min > M){
                min = M;
            }
        }

        int count = 0;
        int ModeMax = 0;
        boolean flag = false;

        for(int i = min + 4000; i <= max + 4000; i++){
            if(arr[i] > 0){
                if(count < (N+1)/2){
                    count+= arr[i];
                    center= i - 4000;
                }

                if(ModeMax < arr[i]){
                    ModeMax = arr[i];
                    mode = i - 4000;
                    flag = true;
                }

                else if(ModeMax == arr[i] && flag == true){
                    mode = i - 4000;
                    flag = false;
                }
            }
        }

        System.out.println((int) Math.round((double) sum/N));
        System.out.println(center);
        System.out.println(mode);
        System.out.println(max - min);

    }
}
