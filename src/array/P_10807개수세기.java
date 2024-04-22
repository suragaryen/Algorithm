package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P_10807개수세기 {
	
	//총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arry = new int[a];
		int count = 0;
		
		for(int i=0; i<a; i++) {
			arry[i] = sc.nextInt();
		}
		
		int b = sc.nextInt();
		
		for(int j=0;j<arry.length; j++) {
			if(arry[j]==b ) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
