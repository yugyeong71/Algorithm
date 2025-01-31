package algorithm;

import java.util.Scanner;

public class AverageOver4344 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt(); // 테스트 개수

        for(int i = 0; i < C; i++){
            int sum = 0; // 점수의 합
            int avg = 0; // 각 테스트의 평균
            int N = 0; // 학생 수

            double over = 0; // 평균의 넘는 학생들의 비율

            N = sc.nextInt(); // 학생 수

            double score[] = new double[N];

            for(int j = 0; j < N; j++){
                score[j] = sc.nextInt(); // N명의 점수
                sum += score[j];
            }

            avg = sum/N; // 각 테스트의 평균

            double M = 0; // 평균이 넘는 학생의 수

            for(int k = 0; k < N; k++){
                if(score[k] > avg){
                    M++;
                }
            }

            System.out.printf("%.3f%%\n",(M/N)*100);
        }
    }
}