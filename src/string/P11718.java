package string;

import java.util.Scanner;

public class P11718 {

    public static void main(String[] args) {
        //입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다.
        // 각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.

        Scanner sc = new Scanner(System.in);


        while (sc.hasNext()) {

            //hasNext = 다음줄에 입력이 있는지의 여부를 판단하여 true/false 를 리턴.

            String s = sc.nextLine();
            //공백을 포함한 문자열도 그대로 출력해야하기때문에 공백을 기준으로 끊는 next()가 아닌 nextLine()을 사용.

            System.out.println(s);

        }//while end

        sc.close();
    }
}
