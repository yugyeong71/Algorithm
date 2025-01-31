package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class OddNumber2576 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] num = new int[7];
        int[] oddNum = new int[7];
        int odd = 0;
        int oddMin = 0;
        int sum = 0;

        for(int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();

            if(num[i] % 2 == 1) {
                sum += num[i];
                oddNum[odd++] = num[i];
            }
        }

        Arrays.sort(oddNum);

        for(int i = 0; i < oddNum.length; i++) {
            if(oddNum[i] != 0) {
                oddMin = oddNum[i];
                break;
            }
        }

        if(sum != 0){
            System.out.println(sum + "\n" + oddMin);
        }

        else{
            System.out.println("-1");
        }
    }
}
