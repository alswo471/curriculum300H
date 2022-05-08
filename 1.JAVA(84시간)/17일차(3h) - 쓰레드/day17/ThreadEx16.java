package day17;

public class ThreadEx16 {
	static long startTime = 0;
	
	public static void main(String[] args) {
		ThreadEx16_1 th1 = new ThreadEx16_1();
		ThreadEx16_2 th2 = new ThreadEx16_2();
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();
		
		try {
			th1.join(); // main�����尡  th1�� �۾��� ���� ������ ��ٸ���.
			th2.join(); // main�����尡 th2�� �۾��� ���� ������ ��ٸ���.
		} catch (InterruptedException e) {}
		
		System.out.print("�ҿ�ð�:" + (System.currentTimeMillis() - ThreadEx16.startTime));
	}
}

class ThreadEx16_1 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print(new String("-"));
		}
	}
}

class ThreadEx16_2 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print(new String("|"));
		}
	}
}