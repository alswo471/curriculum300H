package day08_10.interfaceex;

// Customer Ŭ������ Buy�� Sell �������̽��� ��� ������ 
public class Customer extends Shop implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("�Ǹ��ϱ�");
	}

	@Override
	public void buy() {
		System.out.println("�����ϱ�");
	}
	
	// ����Ʈ �޼��� order()�� Customer Ŭ�������� ��������
	@Override
	public void order() {
		System.out.println("�� �Ǹ� �ֹ�");
	}	
}
