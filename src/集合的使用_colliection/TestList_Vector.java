package 集合的使用_colliection;

import java.util.List;
import java.util.Vector;
/**
 * Vector 的使用和ArrayList的使用没什么不一样的
 * Vector是线程安全
 * @author 鳳
 *
 */
public class TestList_Vector {
	public static void main(String[] args){
		List <String>list = null;
		list = new Vector<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		
		for(int i = 0 ; i<list.size() ; i++){
			System.out.println(list.get(i));
		}
		list.remove(3);
		System.out.println("删除之后！");
		for(int i = 0 ; i<list.size() ; i++){
			System.out.println(list.get(i));
		}
	}
}
