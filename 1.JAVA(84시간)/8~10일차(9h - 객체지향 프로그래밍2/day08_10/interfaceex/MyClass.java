package day08_10.interfaceex;

public class MyClass implements MyInterface {

	// X �������̽����� ��ӹ��� x() �޼��� ���� 
	@Override
	public void x() {
		System.out.println("x()");
	}

	// Y �������̽����� ��ӹ��� y() �޼��� ����
	@Override
	public void y() {
		System.out.println("y()");
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod()");
	}
}
