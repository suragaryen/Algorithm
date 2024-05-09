package string;

import java.util.Scanner;

public class P11720 {

    public static void main(String[] args) {
        //N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String st = sc.next();
        int num = 0;

        for(int i = 0; i < a; i++) {

            num += st.charAt(i) - '0';

            //1. 문자열의 i 번째 값을 char로 변환
            //2. 1번의 값에서 '0' (48)을 빼주면 원하는 값이 나온다. 

        }
        System.out.println(num);
    }

}
