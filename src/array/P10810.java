package array;

import java.util.Scanner;

public class P10810 {

	public static void main(String[] args) {
		
		// 도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다. 또, 1번부터 N번까지 번호가 적혀있는
		// 공을 매우 많이 가지고 있다. 가장 처음 바구니에는 공이 들어있지 않으며, 바구니에는 공을 1개만 넣을 수 있다.
		//도현이는 앞으로 M번 공을 넣으려고 한다. 도현이는 한 번 공을 넣을 때, 공을 넣을 바구니 범위를 정하고, 정한 바구니에 모두 같은 번호가 적혀있는 공을 넣는다.
		//만약, 바구니에 공이 이미 있는 경우에는 들어있는 공을 빼고, 새로 공을 넣는다. 공을 넣을 바구니는 연속되어 있어야 한다.
		//공을 어떻게 넣을지가 주어졌을 때, M번 공을 넣은 이후에 각 바구니에 어떤 공이 들어 있는지 구하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //바구니 숫자 
		int M = sc.nextInt(); // 공 넣기 몇번 할건지? 
		
		int[] B = new int[N+1]; //바구니 숫자로 배열 만들어 주기 (0은 안쓸꺼라서 N+1) 
		
		for(int x = 0; x<M; x++) {
			
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			for(int index = i; index<=j; index++) { //배열 i번부터 j번까지 
					B[index] = k;					//k를 넣어라 
			}
		}
		
		 	for(int i=1; i<=N; i++) {
		 		System.out.print(B[i] + " ");
		 	}
	}

}
