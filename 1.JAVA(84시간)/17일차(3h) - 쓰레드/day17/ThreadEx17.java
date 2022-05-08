package day17;

public class ThreadEx17 {
	public static void main(String[] args) {
		Runnable r = new RunnableEx17();
		new Thread(r).start();
		new Thread(r).start();
	}
}

class RunnableEx17 implements Runnable {
	Account acc = new Account();
	
	public void run() {
		while(acc.getBalance() > 0) {
			// 100, 200, 300���� �� ������ ���Ƿ� �����ؼ� ���(withdraw)
			int money = (int)(Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("balance:" + acc.getBalance());
		}
	}
}
