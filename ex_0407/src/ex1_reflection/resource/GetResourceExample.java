package ex1_reflection.resource;

public class GetResourceExample {
	public static void main(String[] args) {
		
		//Class 클래스 활용하기
		Class clazz = Car.class;
		
		
		//이미지의 경로 얻어오기
		
		//같은 패키지에 있는 image1.jpg 파일의 경로 가져오기
		//getResource() : 클래스가 있는 위치 기준으로 파일 찾기
		//getPath() : 실제 파일 경로를 문자열로 변환
		String image1Path = clazz.getResource("image1.jpg").getPath();
		System.out.println(image1Path);
		
		String image2Path = clazz.getResource("images/image2.jpg").getPath();
		System.out.println(image2Path);
		
		
		
		
		
		
	}
}
