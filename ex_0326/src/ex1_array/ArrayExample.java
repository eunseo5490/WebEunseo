package ex1_array;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		char [] cards = {'1','L','O','2','V','3','E'};
		String myWord="";
		
		//배열에서 문자만 뽑아서 단어 만들기
		//아스키코드 활용하기
		
		for (int i=0; i<cards.length; i++) {
			if(cards[i] < 48 || cards[i] > 57) { //숫자의 아스키코드 범위
				myWord += cards[i];
			}
		}

		System.out.println(myWord);
		
		char i = 32;
		System.out.println(i);
		
		
		//변수 money에 10~5000 사이의 난수를 발생시켜 넣는다.
		//단, 1의 자리 숫자는 반드시 0이 되도록 한다.
		//발생된 난수 money를 동전으로 바꾸면 각 동전이 몇 개 필요한지 코드로 작성
		//가능한 적은 수의 동전을 사용하도록 한다.
		
		int[] coin = {500,100,50,10};

		int money = ((int)((Math.random()*500) + 1))*10;
		System.out.println(money+"원");
		
		for(int i=0;i<coin.length;i++) {
			
		    int count = money/coin[i];
		    money = money%coin[i];

		    System.out.println(coin[i] + "원 동전 : " + count + "개");
		    
		}
		
		
		//키보드에서 배열의 길이를 입력받는다.
		//입력받은 배열의 길이만큼 반복하여 알파벳(사전순)을 요소로 넣는다. (아스키코드)
		
		System.out.print("알파벳 길이 (26 초과 시 반복) : ");
		int length=sc.nextInt();
		
		String alphabet="";
		
		if(length<1) {
			System.out.println("> 1 이상의 수를 입력해주세요.");
		} else {
			for(int i=0; i<length; i++) {
				
				
				char ascii = 65;
				ascii += i;
					
				while (ascii>90) {
					ascii -= 26;
				}
					
				alphabet += ascii;
				//System.out.println(i+" "+j+" "+alphabet);
				
			}
			
			System.out.println("> "+alphabet);
		}
		*/
		
		//로또번호 구하기
		//1~45사이의 난수를 발생시켜 로또번호 6자리를 생성하는 코드
		
		int[] lotto = new int[6];

		for(int i=0; i<lotto.length; i++) {
			
		    int num;
		    
		    boolean isDuplicate;

		    do{
		        isDuplicate=false;
		        
		        num = (int)((Math.random()*45)+1);

		        for(int j=0; j<i; j++) {
		        	
		            if(lotto[j]==num) {
		                isDuplicate=true;
		                break;
		            }
		            
		        }
		    }while(isDuplicate);

		    lotto[i] = num;
		    
		}

		for(int i=0; i<lotto.length; i++) {
		    System.out.print(lotto[i]+" ");
		}
		
		
		
		
		
	}

}
