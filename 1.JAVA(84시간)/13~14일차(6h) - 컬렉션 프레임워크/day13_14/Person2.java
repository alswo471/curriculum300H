package day13_14;

public class Person2 {
	String name;
	int age;
	
	public  Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Person2) {
			Person2 tmp = (Person2)obj;
			return name.equals(tmp.name) && age == tmp.age;
		}
		
		return false;
	}
	
	public int hashCode() {
		return (name + age).hashCode();  // �Ǵ� java.util.Objects Ŭ������ hash�� �̿��ص� �ȴ�. Objects.hash(name+age);
	}
	
	public String toString() {
		return name + ":" + age;
	}
}
