package GenercDome_����;

class Test<T>{
	public T getOut(T t){
		return t;
	}
}
/**
 * ���͵�ʹ��
 * 
 * @author �P
 *
 */
public class GenercDome_3 {
	public static void main(String[] args){
		Test<String> t = new Test<String>();
		String value_1 = t.getOut("�Ҳ�����");
		System.out.println(value_1);
		
		Test<Double> t_1 = new Test<Double>();
		Double value_2 = t_1.getOut(24.3);
		System.out.println(value_2);
		
	}
}
