package ex3_butteredstream.exam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class MemberExample {
	public static void main(String[] args) {
		//members.csv파일을 읽어서 나이가 30 이상인 회원만 senior_members.txt
		//데이터는 , 기준으로 분리
		
        try {
            BufferedReader br = new BufferedReader(new FileReader("members.csv"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("senior_members.txt"));

            String line;
            
            while ((line = br.readLine()) != null) {
            	//1. CSV분리
                String[] data = line.split(",");

                if (data.length < 2) {
                    continue;
                }

                String name = data[0];
                int age = Integer.parseInt(data[1]);

                if (age >= 30) {
                    bw.write(name + "," + age);
                    bw.newLine();
                }
            }

            br.close();
            bw.close();

            System.out.println("30세 이상 회원 저장 완료!");

        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}
}
