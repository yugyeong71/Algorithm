package algorithm;

import java.util.Scanner;

public class Candy2547 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        int sum = 0;

        for(int i = 0; i < test; i++){
            int N = sc.nextInt();
            for(int j = 0; j < N; j++){
                int candy = sc.nextInt();
                sum += candy;
            }
            if(sum % N == 0){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
