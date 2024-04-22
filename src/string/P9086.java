package string;

import java.util.Scanner;

public class P9086 {
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String word[] = new String[n];
		
		
		
		for(int i = 0; i<n; i++) {
			
			String text = sc.next();
			
			word[i] = text.substring(0,1) + text.substring(text.length()-1, text.length());
			// text의 첫번째글자와 마지막 글자를 word변수 안에 저
		
		}//for end
		
		sc.close();
		
		for(int x =0; x<word.length; x++) {
			System.out.println(word[x]);
		}
		
		
	}//main end
}//class end
