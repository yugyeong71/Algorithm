package algorithm;

import java.util.Scanner;

public class RepeatString2675 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        int N = 0;
        String[] str = new String[test];
        String s;
        for(int i = 0; i < test; i++){
            N = sc.nextInt();
            s = sc.next();
            String[] split = s.split("");
            str[i] = "";

            for(int j = 0; j < s.length(); j++){
                for (int k = 0; k < N; k++){
                    str[i] += split[j];
                }
            }
        }
        for (String S: str){
            System.out.println(S);
        }
    }
}
