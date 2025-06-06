package textbook_practice.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ようこそ占いの館へ");
        System.out.print("あなたの名前を入力してください>");
        String name = br.readLine();
        System.out.print("あなたの年齢を入力してください>");
        String ageString = br.readLine();
        ageString = Integer.toString(Integer.parseInt(ageString));
        System.out.println("占いの結果がでました！");




    }
}
