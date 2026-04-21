package ex3_butteredstream;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedRean {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String info = null;
		
		try {
			System.out.print("이름과 나이를 입력하세요 : ");
			info = br.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		String[] arr = info.split(" ");
		System.out.println("입력 내용 : "+ info);
		System.out.println("이름 : "+arr[0]);
		System.out.println("나이 : "+arr[1]);
	}
}
