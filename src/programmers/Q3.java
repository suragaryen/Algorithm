package programmers;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		//영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
		//1 ≤ str의 길이 ≤ 20
		//str은 알파벳으로 이루어진 문자열입니다.
		
			Scanner sc = new Scanner(System.in);
			String a = sc.next();
			int n = a.length();
			char word;
			
			for(int i = 0; i<n ; i++) {
				
				word = a.charAt(i); //i 번째 char을 리턴
				
				if(Character.isUpperCase(word) == true) {
					System.out.println(Character.toLowerCase(word));
				}else {
					System.out.println(Character.toUpperCase(word));
				}
				
			}
		
		
		
		

	}

}
