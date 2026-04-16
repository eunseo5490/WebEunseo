package ex2_charstream;

import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) {
		//char기반의 스트림은 ㅓReader, Writer의 자식클래스들을 사용
		//기본적으로 2byte를 지원하기 때문에 2byte언어로 구성된 파일도 쉽게 입출력 가능
		
		//try-with-resources
		//매개변수로 전달된 객체를 자동으로 닫아준다.0
		try(FileReader fr = new FileReader("test.txt")) {
			int code = 0;
			
			while((code = fr.read()) != -1) {
				System.out.println((char)code);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
