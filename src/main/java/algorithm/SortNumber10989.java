package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SortNumber10989 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[10001];

        for(int i = 0; i < n; i++){
            arr[Integer.parseInt(br.readLine())]++;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1; i < 10001; i++) {
            while (0 < arr[i]--) {
                bw.write(i + "\n");
            }
        }
        br.close();
        bw.close();
    }
}
