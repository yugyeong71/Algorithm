package algorithm;

import java.util.Scanner;

public class WordLength2743 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = 0;
        String word = sc.next();

        for(int i = 0; i < word.length(); i++){
            count ++;
        }

        System.out.println(count);
    }
}
