package 集合的使用_colliection;

import java.util.HashSet;
import java.util.Set;
/***
 *Set接口中HashSet 和 TreeSet的区别
 *HashSet 是无序的存放
 * @author 鳳
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
