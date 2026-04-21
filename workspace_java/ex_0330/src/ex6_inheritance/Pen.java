package ex6_inheritance;

public class Pen {
	int amount;
}

class SharpPen extends Pen {
	double width;
	
}

class BallPen extends Pen {
	String color;
	
}

class FountainPen extends BallPen {
	void refill(int n) {
		this.amount = n;
	}
	
}

