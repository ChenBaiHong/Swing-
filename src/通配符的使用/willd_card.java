package ͨ�����ʹ��;

class willdcard<T>{
	private T info;

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}
	public String toString(){
		/**
		 * һ��Ҫ֪�������������ʲô��˼
		 */
		return this.getInfo().toString();
	}
}
/**
 * ͨ����� ?
 * @author �P
 *
 */
public class willd_card {
	
	public static void main(String[] args){
//		willdcard<String> w = new willdcard<String>();
//		w.setInfo("���Ǻγ��Ĳ����ģ�");
//		willd_card.apply(w);
		
		willdcard<Double> w = new willdcard<Double>();
		w.setInfo(234.3);
		willd_card.apply(w);
	}
	
	public static void apply(willdcard<?> w){
		System.out.println(w);
	}
}
