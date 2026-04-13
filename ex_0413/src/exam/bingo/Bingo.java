package exam.bingo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.*;

//이 클래스는 빙고판의 기능(생성, 출력, 빙고 개수 세기 등)을 담당
public class Bingo {

    int[][] bingoBoard = new int[5][5]; // ⭐ 5x5 이중배열

    public Bingo() {
        createBoard();
    }

    private void createBoard() {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 50; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);

        // ⭐ 2차원 배열에 값 넣기
        int index = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
            	bingoBoard[i][j] = numbers.get(index++);
            }
        }
    }

    void printBoard() {
        System.out.println();
        System.out.println("=== 현재 빙고판 ===");
        

        for (int i = 0; i < 5; i++) {
        	System.out.print(" ");
            for (int j = 0; j < 5; j++) {

                if (bingoBoard[i][j] == 0) {
                    System.out.print(" X ");
                } else if (bingoBoard[i][j] < 10) {
                    System.out.print(" " + bingoBoard[i][j] + " ");
                } else {
                    System.out.print(bingoBoard[i][j] + " ");
                }
            }
            System.out.println(); // ⭐ 한 줄 끝
        }
        
        System.out.println("================");
    }

    // 숫자 체크
    public boolean markNumber(int n) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (bingoBoard[i][j] == n) {
                	bingoBoard[i][j] = 0; // ⭐ 체크하면 0으로

                    System.out.println("[ "+n+" 체크 ]");

                    return true;
                }
            }
        }
        System.out.println("[ ! 빙고판에 없는 숫자 ]");
        return false;
    }
    
    //빙고 개수 계산 기능
    public int countBingo() {
    	int bingoCount=0;
    	boolean bingo = false;
    	
    	//가로 검사
    	for(int i=0; i<bingoBoard.length; i++) {
    		bingo = true;
    		
    		for(int j=0; j<bingoBoard[i].length; j++) {
    			if(bingoBoard[i][j] != 0) { //만약 0이 아니면(체크가 안됐다면) 빙고가 아님으로 설정 후 종료
    				bingo = false;
    				break;
    			}
    		}
    		
    		if(bingo) { //만약 빙고가 맞으면
    			bingoCount++; //빙고를 카운트해주기
    		}
    	}
    	
    	//세로 검사
    	//가로 검사에서 반복문 위치만 바꿈
    	for(int j=0; j<bingoBoard.length; j++) {
    		bingo = true;
    		
    		for(int i=0; i<bingoBoard[i].length; i++) {
    			if(bingoBoard[i][j] != 0) {
    				bingo = false;
    				break;
    			}
    		}
    		
    		if(bingo) {
    			bingoCount++;
    		}
    	}
    	
    	//오른쪽 대각 검사
    	bingo = true;
    	
    	for(int i=0; i<bingoBoard.length; i++) {
    		if(bingoBoard[i][i] != 0) {
				bingo = false;
				break;
    		}
    		
    		if(bingo) {
    			bingoCount++;
    		}
    	}
    	
    	//왼쪽 대각 검사
    	bingo = true;
    	
    	for(int i=0; i<bingoBoard.length; i++) {
    		if(bingoBoard[i][(bingoBoard.length-1)-i] != 0) {
				bingo = false;
				break;
    		}
    		
    		if(bingo) {
    			bingoCount++;
    		}
    	}
    	
    	return bingoCount;
    }
}
