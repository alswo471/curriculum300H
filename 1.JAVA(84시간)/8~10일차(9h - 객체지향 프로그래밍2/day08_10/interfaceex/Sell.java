package day08_10.interfaceex;

public interface Sell {
	void sell();
	
	default void order() {
		System.out.println("�Ǹ� �ֹ�");
	}
}
