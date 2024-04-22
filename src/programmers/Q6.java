package programmers;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		//숫자의 합 구하기
		
		// N 값 입력받기
		Scanner sc = new Scanner(System.in); //입력값 5
		
		int N = sc.nextInt(); //입력값 54321
		
		String sNum = sc.next(); 
		// 입력값을 String형 변수 sNum에 저장한 후 char[]형 변수로 변환하기
		char[] cNum = sNum.toCharArray(); // cNum: ['1', '2', '3', '4', '5']
		int sum = 0;
		
		
		for(int i=0; i<cNum.length; i++) {
			sum += cNum[i] -'0'; //또는 48
			/*
			      sum += cNum[i] - '0';  // sum = 0 + (49 - 48) = 1
                            // sum = 1 + (50 - 48) = 3
                            // sum = 3 + (51 - 48) = 6
                            // sum = 6 + (52 - 48) = 10
                            // sum = 10 + (53 - 48) = 15
			 */
		}
		
		System.out.println(sum);
		// 길이 N 의 숫자를 입력받아  String 형 변수 sNum에 저장하기 
		// sNum을 다시 char []형 변수 cNum에 변환하여 저장하기
		// int형 변수 sum 선언하기
		// for(cNum 길이만큼 반복하기)
		// 배열의 각 자릿값을 정수형으로 변환하여(아스키코드 활용) sum에 더하여 누적하기 
		// sum 출력하기  

	}

}
