package ex3_bytestream.exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example {
	public static void main(String[] args) {
		
		byte[] read = new byte[100];
		
		try {
			FileInputStream f = new FileInputStream("file.txt");
			
			read = new byte[f.available()];
			
			f.read(read);
			
			String ori = new String(read);
			String rev = " ";

			for(int i=ori.length()-1; i<0; i--) {
				rev += ori.charAt(i);
			}
			
			if(ori.equals(rev)) {
				System.out.println(ori+"는 회문입니다.");
			} else {
				System.out.println(ori+"는 회문이 아닙니다.");
			}
			
			f.close();
			
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
