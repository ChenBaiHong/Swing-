package ���ϵ�ʹ��_colliection;

import java.util.List;
import java.util.Vector;
/**
 * Vector ��ʹ�ú�ArrayList��ʹ��ûʲô��һ����
 * Vector���̰߳�ȫ
 * @author �P
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
		System.out.println("ɾ��֮��");
		for(int i = 0 ; i<list.size() ; i++){
			System.out.println(list.get(i));
		}
	}
}
