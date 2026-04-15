package ex3_bytestream.exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LogExample {
	public static void main(String[] args) {
		
		byte[] read = new byte[100];
		
		try {
			FileInputStream ef = new FileInputStream("error.log");
			read = new byte[ef.available()];
			ef.read(read);
			
			String content = new String(read);
			
			int count = 0;
			int index = 0;
			
			while((index = content.indexOf("ERROR", index)) != -1) {
				count++;
				index += "ERROR".length();
			}

			System.out.println("ERROR 등장 횟수 : "+count);
			
			ef.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(read.length);
	}
}
