package �̵߳�ʹ��_Thread;

class RunnableA implements Runnable{
	private String name;
	public RunnableA(String name){
		this.name = name;
	}
	public void run() {
		for(int i = 0 ; i<100 ; i++){
			if(i == 10)
				/*
				 * �߳���ķ���yield()������ �� �������߳�ִ��
				 */
				Thread.yield();
				
			System.out.println(name+"�߳���ִ��" + i);
		}
	}
	
}
public class ThreadRannable {
	public static void main(String[] args){
		RunnableA r1 = new RunnableA("A");
		Thread t1 = new Thread(r1);
		t1.start();
	for(int i = 0 ; i<100 ; i++){
			
			
			System.out.println("���߳� " +i+"��ִ��");
		}
	}
}
