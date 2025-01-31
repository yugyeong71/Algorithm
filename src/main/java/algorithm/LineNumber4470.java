package algorithm;

import java.util.Scanner;

public class LineNumber4470 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String text[] = new String[N];

        for(int i = 1; i <= N; i++){
            text[i] = sc.next();
            System.out.println(i + ". " + text[i]);
        }
    }
}
