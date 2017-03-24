package GenercDome_泛型;

public class GenercDome_Array {
	
	public static void main(String[] args){
		/**
		 * 错为何处 ， 要知道
		 */
		Integer array_1[] = {1 ,2 , 4 , 5};
		print(array_1);
		
		String array_2[] = {"www." , "baidu." , "com"};
		print(array_2);
		
		Double[] array_3 = {1.22 , 1.33 , 1.55};
		print(array_3);
	
		Float[] array_4 = {1.1f , 1.3f , 1.5f};
		print(array_4);
	}
	
	public static <T> void print(T arr[]){
		for(int i = 0 ; i<arr.length ; i++){
			System.out.println(arr[i]);
		}
	}
}
