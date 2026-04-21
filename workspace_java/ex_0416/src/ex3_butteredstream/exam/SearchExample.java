package ex3_butteredstream.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchExample {
	public static void main(String[] args) {
		
		try {
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader file = new BufferedReader(new FileReader("story.txt"));
			
			System.out.print("검색어를 입력하세요.\n> ");
			String keyword = keyboard.readLine();
			
			System.out.println();
			
			String line;
			
			//readLine()이란 파일을 한 줄씩 읽는 것
			while((line = file.readLine()) != null) {
				if(line.contains(keyword)) {
					System.out.println(line);
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
