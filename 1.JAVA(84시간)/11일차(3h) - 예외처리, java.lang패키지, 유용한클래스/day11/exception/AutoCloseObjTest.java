package day11.exception;

public class AutoCloseObjTest {
	public static void main(String[] args) {
		try (AutoCloseObj obj = new AutoCloseObj()) { // ����� ���ҽ� ����
			throw new Exception(); // ���� ���� �߻�
		} catch(Exception e) {
			System.out.println("���� �κ� �Դϴ�.");
		}
	}
}
