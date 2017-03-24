package 集合的使用_迭代器;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestIterator {
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
		Iterator <String> Ite = set.iterator();
		while(Ite.hasNext()){
			String str = Ite.next();
			if("a".equals(str)){
				Ite.remove();
			}else{
				System.out.println(Ite.next());
			}
		}
	}
}
