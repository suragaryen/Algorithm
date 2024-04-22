package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10818 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        
	        int N = Integer.parseInt(st.nextToken());
	        st = new StringTokenizer(br.readLine());
	        
	        int max = Integer.MIN_VALUE; // 최댓값 초기화
	        int min = Integer.MAX_VALUE; // 최솟값 초기화
	        
	        //모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수라고 되어있기 때문에 비교를 위해 max 에는 가장 작은 값으로, min 에는 가장 큰 값으로 초기화를 해준다.
	        
	        for(int i = 0; i < N; i++) {
	            int a = Integer.parseInt(st.nextToken());
	            if (a > max) {
	                max = a;
	            }
	            if (a < min) {
	                min = a;
	            }
	        }
	        
	        System.out.println(min + " " + max);
	    }

}
