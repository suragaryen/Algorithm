package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class P3052_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
		//수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
		
	
		//배열로 풀기 
		
		boolean[] arr = new boolean[42]; //나머지가 나올 수 있는 수 0~41 	
										 //기본값은 false
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i<10; i++) {
			arr[Integer.parseInt(br.readLine()) % 42] = true;
			//같은 값 이라면 같은 배열값에 저장되기 때문에 중복 해결. 
		}
		
		int count = 0;
		for(boolean value : arr) {//arr 중에 true 몇개?? 
			if(value) {
				count++;
			}
		}
			System.out.println(count);
	}

}
