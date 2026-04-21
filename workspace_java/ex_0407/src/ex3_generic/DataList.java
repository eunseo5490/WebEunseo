package ex3_generic;

//클래스에 제네릭을 부여하게 되면 해당 클래스를 선언할 때 데이터 타입을 부여하게 된다.
public class DataList<T> {
	
	private Object[] data;
	private int size;
	private int defaultSize = 10;
	
	//defaultSize만큼의 배열을 생성하는 생성자
	public DataList() {
		this.data = new Object[defaultSize];
	}
	
	//size값을 전달받아서 size만큼의 배열을 생성하는 생성자
	public DataList(int size){
		this.defaultSize = size;
		this.data = new Object[size];
	}
	
	//값을 받아서 배열에 순차적으로 넣는 add 메서드
	public void add(T value) {
		data[size++] = value;
	}
	
	//인덱스를 받아서 배열의 값을 반환하는 get 메서드
	public T get(int index) {
		return (T)data[index];
	}
	
	//배열에 데이터가 몇개 들어가 있는지 확인하는 size() 메서드
	public int size() {
		return size;
	}


	public static void main(String[] args) {
		//데이터리스트 객체 만들기
		//제네릭 타입에 전달할 수 있는 것은 클래스밖에 안된다.
		DataList<Integer> i = new DataList<>(5);
		
		i.add(1);
		//d.add("문자");
		//d.add(3.14);
		i.add(2);
		i.add(3);
		i.add(4);
		i.add(5);
		
		int sum = 0;
		for(int j=0; j<i.size(); j++) {
			System.out.println(i.get(j));
			sum += i.get(j);
		}
		
		System.out.println("데이터 개수 : "+i.size());
		System.out.println("합 : "+sum);
		
		System.out.println();
		
		//실수 타입 객체를 만들고 데이터 3개 넣은 후 출력하기
		DataList<Double> d = new DataList<>(3);
		d.add(1.1);
		d.add(2.2);
		d.add(3.3);
		
		for(int j=0; j<d.size(); j++) {
			System.out.println(d.get(j));
		}
		
		

	}
}

