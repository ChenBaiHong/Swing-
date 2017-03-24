package 通配符的使用;

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
		 * 一定要知道的这下面的是什么意思
		 */
		return this.getInfo().toString();
	}
}
/**
 * 通配符： ?
 * @author 鳳
 *
 */
public class willd_card {
	
	public static void main(String[] args){
//		willdcard<String> w = new willdcard<String>();
//		w.setInfo("我是何尝的不甘心！");
//		willd_card.apply(w);
		
		willdcard<Double> w = new willdcard<Double>();
		w.setInfo(234.3);
		willd_card.apply(w);
	}
	
	public static void apply(willdcard<?> w){
		System.out.println(w);
	}
}
