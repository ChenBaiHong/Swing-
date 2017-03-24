package 集合的使用_colliection;

import java.util.ArrayList;
import java.util.List;
/**
 * List中ArrayList线程使用不安全
 * 但执行效率高
 * @author 鳳
 *
 */
public class TestList_ArrayList {
	public static void main(String[]args){
		List<String> list = null;
		list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("c");
		System.out.println(list);
		for(int i = 0 ; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		list.remove(3);
		System.out.println("删除之后！");
		for(int i = 0 ; i<list.size() ; i++){
			System.out.println(list.get(i));
		}
	}
}
