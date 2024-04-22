package programmers;

import java.util.Scanner;

public class Q1 {
	
	public static void main(String[] args) {
		
		//정수 a와 b가 주어집니다. 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.
		
		//1
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a = " + a + "\n" + "b = " + b);
	
	
        //2
        
        Scanner sc2 = new Scanner(System.in);
        int a1 = sc2.nextInt();
        int b2 = sc2.nextInt();

        while(true){
            if(a1 < -100000) {
                a1 = sc2.nextInt();
                continue;
            }

            if(b2 > 100000) {
                b2 = sc2.nextInt();
                continue;
            }

            break;
        }

        System.out.print("a1 = " + a1 +"\nb2 = " + b2);
	
	}

}
