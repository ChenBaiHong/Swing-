package 线程的使用_Thread;

class RunnableA implements Runnable{
	private String name;
	public RunnableA(String name){
		this.name = name;
	}
	public void run() {
		for(int i = 0 ; i<100 ; i++){
			if(i == 10)
				/*
				 * 线程里的方法yield()，礼让 ， 让其他线程执行
				 */
				Thread.yield();
				
			System.out.println(name+"线程在执行" + i);
		}
	}
	
}
public class ThreadRannable {
	public static void main(String[] args){
		RunnableA r1 = new RunnableA("A");
		Thread t1 = new Thread(r1);
		t1.start();
	for(int i = 0 ; i<100 ; i++){
			
			
			System.out.println("主线程 " +i+"在执行");
		}
	}
}
