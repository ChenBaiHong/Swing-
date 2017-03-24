package GenercDome_·ºÐÍ;

interface GenInt<T>{
	void print();
}

class GenTest_1<T> implements GenInt<String>{
	private T value;
	
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public void print() {
		
	}
	
}
class GenTest_2 implements GenInt<String>{

	private int value_1;
	
	public int getValue_1() {
		return value_1;
	}

	public void setValue_1(int value_1) {
		this.value_1 = value_1;
	}

	public void print() {
		
	}
	
}
public class GenercDome_2 {
	public static void main(String[] args){
		
	}
}
