package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P10890 {
    public static void main(String[] args) throws IOException {
        //첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine(); //baekjoon
        int alpha[] = new int[26];

        for(int i = 0; i < alpha.length; i++){
            alpha[i] = -1;
        }

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i); //ch = b
            if(alpha[ch - 'a'] == -1){ // alpha[98 - 97 ] == -1
                alpha[ch - 'a'] = i; // alpha[1] = 0
            }
            br.close();
        }
        for(int var : alpha){
            System.out.print(var + " ");
        }
    }//main end
}
