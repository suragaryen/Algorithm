package string;

import java.util.Scanner;
public class P2675 {

    public static void main(String[] args) {

        //문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
        // 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다.
        // S에는 QR Code "alphanumeric" 문자만 들어있다.

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 몇 번 입력받을 것인지? 2

        for (int i = 0; i <= N; i++) { //텍스트를 2번 받겠다

            int a = sc.nextInt(); // char이 반복 될 숫자 3
            String st = sc.next(); // ab / ac

            for(int j = 0; j < st.length(); j++) { //2번 반복
                for(int k = 0; k < a; k++) { //3번 반복
                    System.out.print(st.charAt(j));
                }
            }
            System.out.println();
        }//for end
    }
}