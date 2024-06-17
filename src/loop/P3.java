package loop;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        //양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요. 예를 들어 135를 입력하면 그 수는 3자리 입니다라고 출력하고
        //1314를 입력하면 그 수는 4 자리입니다라고 출력

        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.println("정수를 입력 해 주세요: ");
            n = scanner.nextInt();
        }while(n <= 0); //음수를 입력하는 것을 막기 위해 실행

        int no = 0;
        while(n>0){
            n/=10;
            no++;
        }//while end

        System.out.println(no + "자리수");

    }//main end
}
