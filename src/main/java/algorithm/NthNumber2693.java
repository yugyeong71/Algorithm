package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class NthNumber2693 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        int[] num = new int[10];

        for(int i = 0; i < test; i++){
            for(int j = 0; j < num.length; j++){
                num[j] = sc.nextInt();
            }
            Arrays.sort(num);
            System.out.println(num[7]);
        }

    }
}
