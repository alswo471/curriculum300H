package day05_07.constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	public Person() {} // ����Ʈ ������ ���� �߰�
	
	/**
	 * ��� �̸��� �Ű������� �Է¹޾Ƽ�
	 * Person Ŭ������ �����ϴ� ������
	 */
	public Person(String pname) {
		name = pname;
	}
	
	//�̸� Ű, �����Ը� �Ű������� �Է¹޴� ������
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}
