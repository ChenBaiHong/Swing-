package �̵߳�ʹ��_Thread;

class ThreadA extends Thread{
	public ThreadA(){
		
	}
	
	public void run(){
		for(int i = 0 ; i<1100 ; i++){
			/*
			 * ��ȡ��ǰ�̵߳�����
			 */
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class ThreadDemo_1 {
	@SuppressWarnings("unused")
	public static void main(String[] args){
		ThreadA T1 = new ThreadA();
		ThreadA T2 = new ThreadA();
		T1.start();
		for(int i = 0 ; i<1100 ; i++){
			if(i==100)
				try {
					/*
					 * ǿ����ĳ����ִ��
					 */
					T1.join();
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
			System.out.println("���̣߳�-"+ i + "��ִ��");
		}
		
	}
}
