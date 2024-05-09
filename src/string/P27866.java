package string;

import java.util.Scanner;

public class P27866 {
	public static void main(String[] args) {
//		단어 
//		$S$와 정수 
//		$i$가 주어졌을 때, 
//		$S$의 
//		$i$번째 글자를 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		int i = sc.nextInt()-1; // chatAt()이 0부터 시작하기 때문에 1을 빼줌

		System.out.println(S.charAt(i));

		

		

	}

}
