package day05_07.singleton;

public class CompanyTest {
	public static void main(String[] args) {
		// Ŭ���� �̸����� getInstance() ȣ���Ͽ� ���� ������ ����
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		System.out.println(myCompany1 == myCompany1); // �� ������ ���� �ּ����� Ȯ��
	}
}
