package algorithm;

import java.util.Scanner;

public class ACMHotel10250 {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        for (int i = 0; i < test; i++) {

            int height = sc.nextInt();
            int width = sc.nextInt();
            int customer =sc.nextInt();

            int count =0;

            int [] save = new int[10000];

            for (int j = 1; j <= width; j++) {
                for(int k = 1; k <= height; k++) {
                    save[count]=( (k * 100) + j );
                    count++;
                }
            }
            System.out.println(save[customer - 1]);
        }
    }
}
