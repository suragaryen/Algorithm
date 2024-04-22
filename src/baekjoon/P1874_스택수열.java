package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class P1874_스택수열 {

	public static void main(String[] args) {
		//스택 (stack)은 기본적인 자료구조 중 하나로, 컴퓨터 프로그램을 작성할 때 자주 이용되는 개념이다. 
		//스택은 자료를 넣는 (push) 입구와 자료를 뽑는 (pop) 입구가 같아 제일 나중에 들어간 자료가 제일 먼저 나오는 (LIFO, Last in First out) 특성을 가지고 있다.
		//1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다.
		//이때, 스택에 push하는 순서는 반드시 오름차순을 지키도록 한다고 하자. 
		//임의의 수열이 주어졌을 때 스택을 이용해 그 수열을 만들 수 있는지 없는지, 있다면 어떤 순서로 push와 pop 연산을 수행해야 하는지를 알아낼 수 있다. 
		//이를 계산하는 프로그램을 작성하라.
		
		//첫 줄에 n (1 ≤ n ≤ 100,000)이 주어진다. 
		//둘째 줄부터 n개의 줄에는 수열을 이루는 1이상 n이하의 정수가 하나씩 순서대로 주어진다. 
		//물론 같은 정수가 두 번 나오는 일은 없다.
		//입력된 수열을 만들기 위해 필요한 연산을 한 줄에 한 개씩 출력한다. 
		//push연산은 +로, pop 연산은 -로 표현하도록 한다. 불가능한 경우 NO를 출력한다.
		
		//push: top 위치에 새로운 데이터를 삽입 하는 연산
		//pop: top 위치에 현재 있는 데이터를 삭제하고 확인하는 연산 
		
		/*
		 
		 N(수열 개수) A[] (수열 배열)
		 수열 배열 채우기
		 for(N만큼 반복){
		 	if(현재 수열 값>= 오른차순 자연수) {
		 		while(값이 같아질 때까지){
		 			push()
		 			(+) 저장 
		 		}
		 		pop()
		 		(-) 저장 
		 	}
		 	else(현재 수열 값< 오름차순 자연수){
		 		pop()
		 		if(스택 pop 결괏값 > 수열의 수) NO 출력
		 		else(-) 저장  
		 	}
		 }
		 
		 if(-값을 출력한 적이 없으면) 저장한 값 출력  
		 
		 
		 */
		
		
		
		Scanner sc  = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N]; //8
		
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt(); //랜덤한 N개의 숫자가 있다 [4, 3, 6, 8, 7, 5, 2, 1]
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		int num = 1; // 스택에 push될 숫자를 나타내는 변수 초기화
		boolean result = true;
		StringBuffer bf = new StringBuffer();
		for(int i=0; i<A.length; i++) {
			int su = A[i]; // 현재 배열 요소를 변수 su에 저장
			if(su>=num) { // 4>=1? -> YES
				while(su>=num) { //su(빠져야 하는 수) num(스택에 쌓일 수)이 같아질때까지 반복 
					stack.push(num++);
					bf.append("+\n");
				}
				stack.pop();
				bf.append("-\n");
			}else {
				int n = stack.pop();
				if(n>su) {
					System.out.println("NO");
					result = false;
					break;
				}else {
					bf.append("-\n");
				}
			}
		}
		
		if(result) System.out.println(bf.toString());

	}

}
