package condition;

import java.util.Scanner;

public class P_1330두수비교하기 {
	
	
	public static void main(String[] args) {
		
		//두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
		//첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
		//A가 B보다 큰 경우에는 '>'를 출력한다.
		//A가 B보다 작은 경우에는 '<'를 출력한다.
		//A와 B가 같은 경우에는 '=='를 출력한다.
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String result = (a>b) ? (">") : ((a<b) ? ("<") : ("="));
		//변수 = (조건문) ? (true 일 때의 연산) : (false 일 때의 연산)
		System.out.println(result);
		

	}

}
