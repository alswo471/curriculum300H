package day05_07.staticex;

public class StudentTest4 {
	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.setStudentName("������");
		// serialNum ���� �������� ���� get()�޼��带 Ŭ���� �̸����� ���� ȣ��
		System.out.println(Student2.getSerialNum());
		System.out.println(studentLee.studentName + " �й�:" + studentLee.studentID);
		
		Student2 studentSon = new Student2();
		studentSon.setStudentName("�ռ���");
		// serialNum ���� �������� ���� get()�޼��带 Ŭ���� �̸����� ���� ȣ��
		System.out.println(Student2.getSerialNum()); 
		System.out.println(studentSon.studentName + " �й�:" + studentSon.studentID);
	}
}
