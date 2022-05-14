package day08_10.inheritance;

// VIPCustomer Ŭ������ Customer Ŭ������ ��ӹ���
public class VIPCustomer extends Customer { 
	private int agentID; // VIP �� ���� ���̵�
	double saleRatio; // ������
	
	public VIPCustomer(int customerID, String customerName, int agentId) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		this.agentID = agentId;
		
		// ���� Ŭ������ ������ �� �ܼ� ��¹�
		//System.out.println("VIPCustomer() ������ ȣ��");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		
		return price - (int)(price * saleRatio); // ���ε� ������ ����Ͽ� ��ȯ
	}
}