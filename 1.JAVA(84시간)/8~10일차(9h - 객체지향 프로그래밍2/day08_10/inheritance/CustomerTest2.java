package day08_10.inheritance;

public class CustomerTest2 {
	public static void main(String[] args) {
		/**
		VIPCustomer customerKim = new VIPCustomer(); // ���� Ŭ���� ����
		customerKim.setCustomerID(1020);
		customerKim.setCustomerName("������");
		*/
		VIPCustomer customerKim = new VIPCustomer(1020, "������", 1000);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}
}
