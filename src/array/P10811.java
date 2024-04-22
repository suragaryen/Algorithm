package array;

import java.util.Scanner;

public class P10811 {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 바구니 갯수
        int[] arry = new int[N]; // 바구니 배열

        int M = sc.nextInt(); // 바구니의 순서를 역순으로 만들 횟수

        // 바구니에 숫자 채워넣기
        for (int a = 0; a < N; a++) {
            arry[a] = a + 1;
        }

        // M번의 역순 만들기 작업
        for (int i = 0; i < M; i++) {
            int j = sc.nextInt() - 1; // 역순 범위의 시작
            int k = sc.nextInt() - 1; // 역순 범위의 끝

            // j부터 k까지의 바구니 순서를 역순으로 만듦
            while (j < k) {
            	
                int temp = arry[j]; 
                arry[j] = arry[k];
                arry[k] = temp;
                j++;
                k--;
            }
        }

        // 결과 출력
        for (int y = 0; y < N; y++) {
            System.out.print(arry[y] + " ");
        }

        sc.close(); // 스캐너 닫기
    }
}
