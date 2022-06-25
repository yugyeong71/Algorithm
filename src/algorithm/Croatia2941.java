package com.company.src.algorithm;

import java.util.*;

public class Croatia2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();

        st = st.replaceAll("c=","1");
        st = st.replaceAll("c-","1");
        st = st.replaceAll("dz=","1");
        st = st.replaceAll("d-","1");
        st = st.replaceAll("lj","1");
        st = st.replaceAll("nj","1");
        st = st.replaceAll("s=","1");
        st = st.replaceAll("z=","1");

        System.out.println(st.length());

    }
}
