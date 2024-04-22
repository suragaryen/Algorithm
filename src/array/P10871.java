package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10871 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        
        int[] arry = new int[N];
        
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            if(a < X) {
                arry[i] = a;
            }
        }
        
        
        for(int i = 0; i < N; i++) {
            if (arry[i] != 0) {
                System.out.print(arry[i] + " ");
            }
        }
    }
}
