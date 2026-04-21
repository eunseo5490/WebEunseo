package ex2_file.exam;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		File fd = new File("Folder1");
		fd.mkdir();
		
		if(!fd.exists()) {
			boolean created = fd.mkdir();
			if(created) {
				System.out.println("폴더 생성 완료");
			} else {
				System.out.println("폴더 생성 실패 (이미 생성됨)");
				return;
			}
		}
		
		
		if(fd.isDirectory()) {
			System.out.println("폴더가 아님");
			return;
		}
		
		
		File[] items = fd.listFiles();
		
		if(items == null) {
			System.out.println("폴더 내용을 읽을 수 없습니다.");
			return;
		}
		
		
		for(File item : items) {
			if(item.isDirectory()) {
				System.out.println("[DIR] "+item.getName());
			} else if(item.isFile()) {
				System.out.println("[FILE] "+item.getName());
			}
		}
		
		System.out.println("총 항목 수 : "+items.length);
		
	}
}
