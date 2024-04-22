package loop;

import java.util.Scanner;

public class P_11021 {
	
	public static void main(String[] args) {
		
		//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); // 반복할 횟수
		
		for(int i=1; i<=a; i++ ) {
			
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			System.out.println("case" + "#" + i + ":" + (b+c));
			
		}
			
		
		
	}
}
