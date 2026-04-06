package ex5_Math;

import java.util.Arrays;
import java.util.Scanner;

public class Random {
public static void main(String[] args) {
	
	int[] randomNumber = new int[6];

	for(int i=0; i<randomNumber.length; i++) {
		
	    int num;
	    boolean isDuplicate;

	    do{
	        isDuplicate=false;
	        
	        num = (int)((Math.random()*45)+1);

	        for(int j=0; j<i; j++) {
	        	
	            if(randomNumber[j]==num) {
	                isDuplicate=true;
	                break;
	            }
	            
	        }
	    }while(isDuplicate);

	    randomNumber[i] = num;
	    
	}
	
	
	Scanner sc = new Scanner(System.in);
	int[] lotto = new int[6];
	
	System.out.println("1~45의 로또번호 6개를 입력해주세요.");
	for(int i=0; i<lotto.length; i++) {
		lotto[i] = sc.nextInt();
	}
	
	Arrays.sort(randomNumber);
	Arrays.sort(lotto);
	
	if(Arrays.equals(randomNumber, lotto)) {
		System.out.println("당첨");
	} else {
		System.out.println("꽝");
	}
	
	System.out.println("로또 번호 : " + Arrays.toString(randomNumber));
    System.out.println("내 번호 : " + Arrays.toString(lotto));
	
	
}
}
