package string;

import java.util.Scanner;

public class StringMix {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        String answer = "";
        for(int i = 0; i < str1.length(); i++) {

            answer = answer + str1.charAt(i) + str2.charAt(i);
        }

        System.out.println(answer);


    }//main end
}
