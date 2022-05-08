package day17;

import javax.swing.JOptionPane;

class ThreadEx12_1 extends Thread {
	public void run() {
		int i = 10;
		
		while(i != 0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x=0;x < 250000000000L;x++); // �ð� ����
		}
		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�.");
	}
}

public class ThreadEx12 {
	public static void main(String[] args) throws Exception {
		ThreadEx12_1 th1 = new ThreadEx12_1();
		th1.start();
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
		th1.interrupt(); // interrupt()�� ȣ���ϸ�, interrupted���°� true�� �ȴ�.
		System.out.println("isInterrupted():" +  th1.isInterrupted()); // true
	}
}
