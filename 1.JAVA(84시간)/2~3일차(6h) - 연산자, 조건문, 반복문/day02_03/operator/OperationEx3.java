package day02_03.operator;

public class OperationEx3 {
	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		// �� ������ �� ���� ��� ���� �����̹Ƿ� ((i = i + 2) < 10); ������ ������� �ʴ´�.
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		// �� �տ��� �� ���� ��� ���� ���̹Ƿ� ((i = i + 2) < 10);�� ������� ����
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}
}
