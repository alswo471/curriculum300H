package day05_07.hiding;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
		//studentLee.studentName = "�̻��"; // �����߻�
		
		// setStudentName() �޼��� Ȱ���� private ������ ���� ����
		studentLee.setStudentName("�̻��");
		
		System.out.println(studentLee.getStudentName());
	}
}
