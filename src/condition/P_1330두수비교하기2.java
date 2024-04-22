package condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P_1330두수비교하기2 {
	
	
	public static void main(String[] args) throws IOException {
		
		//두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
		//첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
		//A가 B보다 큰 경우에는 '>'를 출력한다.
		//A가 B보다 작은 경우에는 '<'를 출력한다.
		//A와 B가 같은 경우에는 '=='를 출력한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine(); // readLine()은 한 행을 전부 읽는다. 
		StringTokenizer st = new StringTokenizer(str, " "); 
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		String result = (a>b) ? (">") : ((a<b) ? ("<") : ("="));
		
		

	}

}
