package algorithm;

import java.util.Scanner;

public class AsubB10950 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int A = 0;
        int B = 0;
        int arr[] = new int[T];

        for(int i = 0; i < T; i++){
            A = sc.nextInt();
            B = sc.nextInt();
            arr[i] = A + B;
        }

        for (int i : arr){
            System.out.println(i);
        }
    }
}
