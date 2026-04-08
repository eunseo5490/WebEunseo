package ex3_generic;

//제네릭 타입은 두 개 이상도 작성할 수 있다.
class PairBox<T,U> {
	private T first;
	private U second;
	
	public void set(T first, U second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() {
		return first;
	}
	
	public U getSecond() {
		return second;
	}
}

public class MultiTypeExample {
	public static void main(String[] args) {
		PairBox<String, Integer> box = new PairBox();
		
		box.set("홍길동", 5);
		System.out.println(box.getFirst()+" "+box.getSecond());
	}
}
