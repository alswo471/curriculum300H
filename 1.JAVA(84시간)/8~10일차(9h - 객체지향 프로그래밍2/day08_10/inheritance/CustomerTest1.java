package day08_10.inheritance;

public class CustomerTest1 {
	public static void main(String[] args) {
		//Customer customerLee = new Customer();
		// CustomerID�� customerName�� protected �����̹Ƿ� set() �޼��� ȣ��
		//customerLee.setCustomerID(10010);
		//customerLee.setCustomerName("�̼���");
		Customer customerLee = new Customer(10010, "�̼���");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		//VIPCustomer customerKim = new VIPCustomer();
		// CustomerID�� customerName�� protected �����̹Ƿ� set() �޼��� ȣ��
		//customerKim.setCustomerID(10020);
		//customerKim.setCustomerName("������");
		VIPCustomer customerKim = new VIPCustomer(10020, "������", 1000);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}
}
