package ���ϵ�ʹ��_colliection;

import java.util.HashSet;
import java.util.Set;
/***
 *Set�ӿ���HashSet �� TreeSet������
 *HashSet ������Ĵ��
 * @author �P
 *
 */
public class TestSet_HashSet {
	public static void main(String[] args){
		Set<String> set = null;
		set = new HashSet<String>();
		set.add("a");
		set.add("c");
		set.add("d");
		set.add("h");
		set.add("g");
		set.add("w");
		set.add("q");
		System.out.println(set);
	}
}
