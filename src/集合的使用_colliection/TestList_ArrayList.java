package ���ϵ�ʹ��_colliection;

import java.util.ArrayList;
import java.util.List;
/**
 * List��ArrayList�߳�ʹ�ò���ȫ
 * ��ִ��Ч�ʸ�
 * @author �P
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
		System.out.println("ɾ��֮��");
		for(int i = 0 ; i<list.size() ; i++){
			System.out.println(list.get(i));
		}
	}
}
