package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CoordinateCompression18870 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");

        int[] num = new int[N];
        for (int i = 0; i < N; i++){
            num[i] = Integer.parseInt(input[i]);
        }

        int[] sortNum = num.clone();

        Arrays.sort(sortNum);

        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;

        for (int n : sortNum){
            if (!map.containsKey(n))
                map.put(n, index++);
        }


        StringBuilder sb = new StringBuilder();

        for (int n : num){
            sb.append(map.get(n)).append(' ');
        }

        System.out.println(sb.toString());


    }
}
