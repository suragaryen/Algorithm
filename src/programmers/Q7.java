package programmers;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		
		//세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.

		//	예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.

		//	세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
		
		
		Scanner sc = new Scanner(System.in); //과목의 수 입력받기 
		int N = sc.nextInt(); //길이가 N인 1차원 배열A[] 선언하기 
		
		long sum = 0;
		long max =0;
		
		for(int i=0; i<N; i++) {
			int temp =sc.nextInt();
			if(temp>max)max=temp;
			sum = sum + temp;
		}
		System.out.println(sum*100.0/max/N);
	}

}
