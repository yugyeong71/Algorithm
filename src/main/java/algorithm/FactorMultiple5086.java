package algorithm;

import java.util.Scanner;

public class FactorMultiple5086 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true){
            int N = sc.nextInt();
            int M = sc.nextInt();

            if(N == 0 && M == 0){
                break;
            }

            else if(M % N == 0){
                System.out.println("factor");
            }

            else if(N % M == 0){
                System.out.println("multiple");
            }

            else {
                System.out.println("neither");
            }
        }
    }
}
