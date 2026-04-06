package ex5_Math;

import java.util.Random;

public class MathExample {
	public static void main(String[] args) {
		
		//올림
		double v1 = Math.ceil(5.3);
		System.out.println(v1);
		
		//내림
		double v2 = Math.floor(5.3);
		System.out.println(v2);
		
		//반올림(무조건 소수점 첫째자리)
		System.out.println(Math.round(3.15));
		
		//절대값
		double v3 = Math.abs(-10);
		System.out.println(v3);
		
		//제곱
		System.out.println(Math.pow(2, 3));
		
		//제곱근
		System.out.println(Math.sqrt(9.0));
		
		
		//최대값찾기
		long v4 = Math.max(3, 7);
		System.out.println("더 큰 수 : "+v4);
		
		//최소값찾기
		long v5 = Math.max(3, 7);
		System.out.println("더 작 수 : "+v5);
		
		int[] arr = {5,2,9,1,7};
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			max = Math.max(max, arr[i]);
			
			min = Math.min(min, arr[i]);
			
		}
		System.out.println(max);
		System.out.println(min);
		
		
		int rand = (int) (Math.random()*11+10);
		System.out.println(rand);
		
		
		int x1 = -5;
		double x2 = 8;
		System.out.println(Math.abs(x1)+Math.abs(x2));
		
		int object = 53;
		System.out.println(Math.ceil(object/8.0));
		
		
		
	}
}
