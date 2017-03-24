package 集合的使用_colliection;


import java.util.Set;
import java.util.TreeSet;
/**
 * Set中的TreeSet和HashSet的区别是
 * TreeSet是有序的存放
 * @author 鳳
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
