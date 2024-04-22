package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arry = new int[9];
		int max = Integer.MIN_VALUE;
		int index=0;
		
		for(int i=0; i<arry.length; i++) {
			
			int a = Integer.parseInt(st.nextToken());
			arry[i] = a;
			
			if(arry[i]>max) {
				
				max=arry[i];
				index=i+1;
				
			}	
			
		}//for end
		
		System.out.println(max);
		System.out.println(index);
		
	
	}//main end

}//class end
