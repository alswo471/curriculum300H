package day05_07.staticex;

public class Student2 {
	private static int serialNum = 1000; // private ������ ����
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student2() {
		serialNum++; 
		studentID = serialNum; 
	}
	
	public String getStudentName() {
		return studentName;
	}
		
	public void setStudentName(String name) {
		studentName = name;
	}
	
	// serialNum�� get()�޼���
	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}
	
	// serialNum�� set()�޼���
	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
}
