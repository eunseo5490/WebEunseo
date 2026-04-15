package ex3_bytestream.exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class LoginExample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String inputID = sc.nextLine();
		String inputPW = sc.nextLine();
		
		//System.out.println(inputID);
		//System.out.println(inputPW);
		
		byte[] read = new byte[100];
		
		try {
			FileInputStream users = new FileInputStream("member.txt");
			read = new byte[users.available()];
			users.read(read);
			
			String info = new String(read);
			String[] lines = info.split("\\r?\\n");
			
			//System.out.println(lines[0].toString());
			//System.out.println(lines[1].toString());
			
			if(inputID.equals(lines[0]) && inputPW.equals(lines[1])) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패");
			}
			
			users.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

