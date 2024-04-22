package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Nameis {
	//총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
		public static void main(String[] args) throws NumberFormatException, IOException {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int N = Integer.parseInt(br.readLine());
			int [] arry = new int[N];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i<N; i++) {
				
				arry[i] = Integer.parseInt(st.nextToken());
			}
			
			int a = Integer.parseInt(br.readLine());
			int count = 0;
			
			for(int j = 0; j<arry.length; j++) {
				
				if(arry[j] == a) {
					
					count ++;
				}
				
				System.out.println(count);
			}
			
		}

}
