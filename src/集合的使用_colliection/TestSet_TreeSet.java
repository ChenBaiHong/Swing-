package ���ϵ�ʹ��_colliection;


import java.util.Set;
import java.util.TreeSet;
/**
 * Set�е�TreeSet��HashSet��������
 * TreeSet������Ĵ��
 * @author �P
 *
 */
public class TestSet_TreeSet {
	public static void main(String[] args){
		Set<String> set = null;
		set = new TreeSet<String>();
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
