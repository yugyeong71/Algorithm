package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        char str[];

        for(int i = 0; i < test; i++){
            str = sc.next().toCharArray();

            int sum = 0, num = 0;
            for(char n : str){
                if(n == 'O'){
                    num ++;
                    sum += num;
                }
                else {
                    num = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
