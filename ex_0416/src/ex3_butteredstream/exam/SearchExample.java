package ex3_butteredstream.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchExample {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String search = null;
		
		try {
			System.out.print("검색어를 입력하세요.\n> ");
			search = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("[ 검색어 ] "+search);
		System.out.println("[ 검색된 줄 ]");
		System.out.println("- ");
		System.out.println("- ");
		
	}
}
