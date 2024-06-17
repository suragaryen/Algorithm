package loop;

import java.util.Scanner;

public class P2 {

    public static void main(String[] args) {
        //두 변수 a, b에 정수를 입력하고 b-a를 출력하는 프로그램을 작성하세요

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        while (true) { //break를 만나기 전까지 계속 실행
            int b = sc.nextInt();
            System.out.println("a보다 큰 값을 입력하라 ");
          if(b>=a){
              System.out.println(b-a);
              break;
          }//if end

        }//while end

    }//main end
}
