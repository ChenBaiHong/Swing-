package ���ϵ�ʹ��_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap_1 {
	public static void main (String[] args){
		Map<String , String> map = new HashMap<String , String>();
		map.put("key1", "www.");
		map.put("key2", "hash.");
		map.put("key3", "map.");
		map.put("key4", "com");
		System.out.println(map);
		/*if(map.containsKey("key")){
			System.out.println("���ڵļ�ֵ��");
		}else{
			System.out.println("�����ڵļ�ֵ��");
		}*/
		Set<String> str = map.keySet();
		Iterator<String> it = str.iterator();
		
		while(it.hasNext()){
			/*if("key4".equals(it.next())){
				it.remove();
			}*/
			System.out.println(it.next());
		}
		
		/**
		 * һ��Ҫ֪��Ϊʲôһ����Collection�ӿ�
		 */
		Collection<String> sr = map.values();
		Iterator<String> It = sr.iterator();
		while(It.hasNext()){
			System.out.println(It.next());
		}
	}
}
