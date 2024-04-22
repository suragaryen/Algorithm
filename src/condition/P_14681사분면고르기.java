package condition;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P_14681사분면고르기 {

	public static void main(String[] args) {
		// 두수 입력 받기
		// + + = 1
		// - + = 2
		// - - = 3
		// + - = 4
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		int result = 0;
		if (a > 0 && b > 0) {
		    result = 1;
		} else if (a < 0 && b > 0) {
		    result = 2;
		} else if (a < 0 && b < 0) {
		    result = 3;
		} else if (a > 0 && b < 0) {
		    result = 4;
		}
		
		
		System.out.println(result);
		
				
		

	}

}
