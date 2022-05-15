package day11.object;

class Book {
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
	public String toString() { // toString() �޼��� ������
		return bookTitle + "," + bookNumber;
	}
}

public class ToStringEx {
	public static void main(String[] args) {
		Book book1 = new Book(200, "����");
		
		 // Ŭ���� ����(Ŭ���� �̸�, �ּ� ��)
		System.out.println(book1);
		
		// toString())) �޼���� �ν��Ͻ� ����(Ŭ���� �̸�, �ּ� ��)�� ���� ��
		System.out.println(book1.toString());
	}
}
