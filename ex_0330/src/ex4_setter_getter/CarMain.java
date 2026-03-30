package ex4_setter_getter;

import java.util.Scanner;

public class CarMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Car c = new Car();
		c.setSpeed(sc.nextInt());
		
		System.out.println("speed : "+c.getSpeed());
		
		//멈춤
		if(!c.isStop()) {
			c.setStop(true);
		}
		
		System.out.println("speed : "+c.getSpeed());
	}

}
