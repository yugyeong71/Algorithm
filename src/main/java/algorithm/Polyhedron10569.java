package algorithm;

import java.util.Scanner;

public class Polyhedron10569 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int V = sc.nextInt();
            int E = sc.nextInt();

            int side = -(V - E) + 2;

            System.out.println(side);
        }
    }
}
