package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class SortInside1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char M[] = sc.nextLine().toCharArray();

        Arrays.sort(M);

        for(int i = M.length - 1; i >= 0; i--){
            System.out.print(M[i]);
        }
    }
}