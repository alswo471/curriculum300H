package day08_10.interfaceex;

public interface Calc {
	// �������̽����� ������ ������ ������ �������� ����� ��ȯ��
	double PI = 3.14;
	int ERROR = -9999999;
	
	// �������̽����� ������ �޼���� ������ �������� �߻� �޼���� ��ȯ��
	int add(int num1, int num2);
	int subtract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("���� ���⸦ �����մϴ�.");
		// ����Ʈ �޼��忡�� private �޼��� ȣ��
		myMethod();
	}
	
	// �������̽��� ���� �޼��� total() ����
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		// ���� �޼��忡�� private static �޼��� ȣ��
		myStaticMethod(); 
		return total;
	}
	
	// private �޼���
	private void myMethod() {
		System.out.println("private �޼��� �Դϴ�.");
	}
	
	// private static �޼���
	private static void myStaticMethod() {
		System.out.println("private static �޼����Դϴ�.");
	}
}
