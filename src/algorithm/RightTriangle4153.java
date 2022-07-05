package com.company.src.algorithm;

import java.util.*;

public class RightTriangle4153 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true){
            int side1 = sc.nextInt();
            int side2 = sc.nextInt();
            int side3 = sc.nextInt();

            if(side1 == 0 && side2 == 0 && side3 == 0){
                break;
            }

            if((side1 * side1 + side2 * side2) == side3 * side3){
                System.out.println("right");
            }
            else if((side3 * side3 + side2 * side2) == side1 * side1){
                System.out.println("right");
            }
            else if((side1 * side1 + side3 * side3) == side2 * side2){
                System.out.println("right");
            }
            else{
                System.out.println("wrong");
            }
        }


    }
}
