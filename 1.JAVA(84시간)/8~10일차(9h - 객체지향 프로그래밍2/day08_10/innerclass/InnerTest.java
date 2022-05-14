package day08_10.innerclass;

class OutClass { // �ܺ� Ŭ����
	private int num = 10; // �ܺ� Ŭ���� private ����
	private static int sNum = 20; // �ܺ� Ŭ���� ���� ����
	
	private InClass inClass; // ���� Ŭ���� �ڷ��� ������ ���� ����
	
	static class InStaticClass { // ���� ���� Ŭ���� 
		int inNum = 100; // ���� ���� Ŭ������ �ν��Ͻ� ����
		static int sInNum = 200; // ���� ���� Ŭ������ ���� ����
		
		// ���� ���� Ŭ������ �Ϲ� �޼���
		void inTest() {
			//num += 10; // �ܺ� Ŭ������ �ν��Ͻ� ������ ����� �� ����.
			System.out.println("InStaticClass inNum = " + inNum + "(���� Ŭ������ �ν��Ͻ� ���� ���)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ���� ���� ���)");
			System.out.println("OutClass sNum = " + inNum + "(�ܺ� Ŭ������ ���� ���� ���)");
		}
		
		// ���� ���� Ŭ������ ���� �޼���
		static void sTest() {
			// �ܺ� Ŭ������ ���� Ŭ������ �ν��Ͻ� ������ ����� �� ����.
			//num += 10;
			//inNum += 10
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ���� ���)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ���� ���� ���)");
			
		}
	}
	
	
	 // �ܺ� Ŭ���� ����Ʈ ������, �ܺ� Ŭ������
	// ������ �� ���� Ŭ���� ���� ����
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass { // �ν��Ͻ� ���� Ŭ���� 
		int inNum = 100;  // ���� Ŭ������ �ν��Ͻ� ����
		// JDK15������ �ν��Ͻ� ���� Ŭ������ �������� ������ �Ұ���, JDK16���ʹ� ����
		//static int sInNum = 200;
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ����)");
		}
		
		//JDK15������ �ν��Ͻ� ���� Ŭ������ �����޼��� ������ �Ұ���, JDK16���ʹ� ����
		//static void sTest() {
		//}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
}

public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("�ܺ� Ŭ���� �̿��Ͽ� ���� Ŭ���� ��� ȣ��");
		outClass.usingClass(); // ���� Ŭ���� ��� ȣ��
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("���� ���� Ŭ���� �Ϲ� �޼��� ȣ��");
		sInClass.inTest();
		System.out.println();
		System.out.println("���� ���� Ŭ������ ���� �޼��� ȣ��");
		OutClass.InStaticClass.sTest();
	}
}
