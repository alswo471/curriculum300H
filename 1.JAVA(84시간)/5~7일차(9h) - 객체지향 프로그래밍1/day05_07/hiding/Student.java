package day05_07.hiding;

public class Student {
	int studentID;
	// studentName ������ private���� ���� 
	private String studentName; 
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
