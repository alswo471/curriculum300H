package day05_07;

public class Student {
	int studentID; 
	String studentName;
	int grade; 
	String address; 
	

	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	// main() �Լ� 
	public static void main(String[] args) {
		Student studentAhn = new Student(); // Student Ŭ���� ����
		studentAhn.studentName = "�ȿ���";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
