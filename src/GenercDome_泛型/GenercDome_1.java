package GenercDome_泛型;

class what<K , T>{
	private K value_1;
	public K getValue_1() {
		return value_1;
	}
	public void setValue_1(K value_1) {
		this.value_1 = value_1;
	}
	
	private T value_2;
	public T getValue_2() {
		return value_2;
	}
	public void setValue_2(T value_2) {
		this.value_2 = value_2;
	}
}
/**
 * 多泛型的实例化
 * 
 * @author 鳳
 *
 */
public class GenercDome_1 {
	
	public static void main(String[] args){
		what<String , Integer> Is = new what<String, Integer>();
		Is.setValue_1("我不甘心！");
		Is.setValue_2(325);
		System.out.println(Is.getValue_2());
		System.out.println(Is.getValue_1());
		
	}
}
