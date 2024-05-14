package string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class P1152 {
    public static void main(String[] args) {

        //영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
        // 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        StringTokenizer st = new StringTokenizer(s, " ");
        System.out.println(st.countTokens());

    }
}
