package day08_10.interfaceex;

public class MyClassTest {
	public static void main(String[] args) {
		MyClass mClass = new MyClass();
		
		// ���� �������̽� X������ �����ϸ�
		// X�� ������ �޼��常 ȣ�� ����
		X xClass = mClass;
		xClass.x();
		
		// ���� �������̽� Y������ �����ϸ�
		// Y�� ������ �޼��常 ȣ�� ����
		Y yClass = mClass;
		yClass.y();
		
		// ������ �������̽��� ������ �����ϸ� 
		// �������̽��� ����� ��� �޼��� ȣ�� ���� 
		MyInterface iClass = mClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();
		
	}
}
