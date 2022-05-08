package day17;

public class ThreadEx15 {
	public static void main(String[] args) {
		ThreadEx15_1 th1 = new ThreadEx15_1("*");
		ThreadEx15_1 th2 = new ThreadEx15_1("**");
		ThreadEx15_1 th3 = new ThreadEx15_1("***");
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000);
			th1.suspend();
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume();
			Thread.sleep(3000);
			th1.stop();
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
		} catch (InterruptedException e) {}
	}
}

class ThreadEx15_1  implements Runnable {
	volatile boolean suspended = false;
	volatile boolean stopped = false;
	
	Thread th;
	
	ThreadEx15_1(String name) {
		th = new Thread(this, name);
	}
	
	public void run() {
		String name = th.getName();
		
		while(!stopped) {
			if (!suspended) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(name + " - interrupted");
				}
			} else { // ���������̸� �ٸ� ������� �ٷ� �纸�Ѵ�(�ѱ��) - ���伺 ��� 
				Thread.yield();
			}
		}
		System.out.println(Thread.currentThread().getName() + " - stopped");
	}
	
	public void suspend() {
		suspended = true;
		th.interrupt();
		System.out.println(th.getName() + " - interrupt() by suspend()");
		// interrupt()�� ȣ���ϸ� sleep ������ �ǳʶ�� �ٷ� InterruptedException���� �ǳʶ�Ƿ� ���伺�� ��������.
	}
	
	public void resume() {
		suspended = false;
	}
	
	public void stop() {
		stopped = true;
		th.interrupt();
		System.out.println(th.getName() + " - interrupt() by stop()");
		// interrupt()�� ȣ���ϸ� sleep ������ �ǳʶ�� �ٷ� InterruptedException���� �ǳʶ�Ƿ� ���伺�� ��������.
	}
	
	public void start() {
		th.start();
	}
}