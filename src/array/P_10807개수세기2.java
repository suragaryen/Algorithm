package array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P_10807개수세기2 {
	
	public static void main(String[] args) throws IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arry = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arry[i] = Integer.parseInt(st.nextToken());
        }

        int a = Integer.parseInt(br.readLine());
        int count = 0;

        for (int j = 0; j < arry.length; j++) {
            if (arry[j] == a) {
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.newLine();

        br.close();
        bw.flush();
        bw.close();
    }

}
