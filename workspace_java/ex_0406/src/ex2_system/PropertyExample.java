package ex2_system;

import java.util.Properties;
import java.util.Set;

public class PropertyExample {
	public static void main(String[] args) {
		//운영ㅊ제와 사용자 정보 출력
		
		//운영체제 이름
		String osName = System.getProperty("os.name");
		
		//사용자 이름
		String userName = System.getProperty("user.name");
		
		//사용자 홈 디렉토리 경로
		String userHome = System.getProperty("user.home");
		
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
		
		//System 클래스로부터 속성들의 목록을 가져와 변수에 저장
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object objkey : keys) {
			String key = (String) objkey;
			String value = System.getProperty(key);
			System.out.printf("%-40s: %s\n", key, value);
		}
	}
}
